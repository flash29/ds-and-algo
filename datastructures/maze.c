#include "stdio.h"
#include "stdlib.h"
/*
Maze Problem
*/

int capacity=1;
int top=-1;
#define ROW_SIZE 11
#define COL_SIZE 8
int mark[ROW_SIZE][COL_SIZE];

//int maze[ROW_SIZE][COL_SIZE];

int maze[11][8]={
    {1,1,1,1,1,1,1,1},
    {1,0,0,0,0,0,1,1},
    {1,1,1,1,1,1,0,1},
    {1,1,0,0,0,0,1,1},
    {1,0,1,1,1,1,1,1},
    {1,1,0,0,0,0,1,1},
    {1,1,1,1,1,1,0,1},
    {1,1,0,0,0,0,1,1},
    {1,0,1,1,1,1,1,1},
    {1,1,0,0,0,0,0,1},
    {1,1,1,1,1,1,1,1}
    };

typedef struct {
    int row;
    int col;
    int dir;
}element;

element position;
element *stack;


typedef struct{
    int vert;
    int hor;
}offsets;

offsets move[8]={
    {-1, 0}, //north
    {-1, 1}, //north-east
    {0, 1},  //east
    {1, 1}, //south-east
    {1, 0}, //south
    {1, -1}, //south-west
    {0, -1}, //west
    {-1, -1} //north-west
};



void stackFull(){
    stack = realloc(stack, 2*capacity*sizeof(stack) );
    capacity*=2;
}

void stackEmpty(){
    fprintf(stderr, "Stack is Empty, Cannot remove element.\n STACK UNDERFLOW\n");
    exit(EXIT_FAILURE);
}

void push(element position){

    if(top>=capacity-1){
        stackFull();

    }
    stack[++top]= position;
}

element pop(){

    if(top==-1){
        stackEmpty();

    }
    return stack[--top];
}

void display(){
    int i;
    printf("Row  Col\n");
    for(i=0;i<=top;i++){
        printf("%d\t%d\t\n", stack[i].row, stack[i].col);
    }
}

int main(){

    int found = 0, row, col, nextRow, nextCol, dir;

    stack = malloc(capacity*sizeof(element));

    stack[0].row=1;
    stack[0].col=1;
    stack[0].dir=1;
    top=0;
    mark[1][1] = 1;

    for(int i=0;i<ROW_SIZE;i++){
        for(int j=0;j<COL_SIZE;j++){
            mark[i][j]=0;
        }
    }

    while(top>-1 && !found){

        position = pop();
        row= position.row;
        col= position.col;
        dir= position.dir;

        while(dir<8 && !found){

            nextRow = row + move[dir].vert;
            nextCol = col + move[dir].hor;

            if(nextRow == (ROW_SIZE-2) && nextCol == (COL_SIZE-2)){
                found =1;
            }
            else if(!maze[nextRow][nextCol] && !mark[nextRow][nextCol]){

                mark[nextRow][nextCol]=1;
                position.row= nextRow;
                position.col= nextCol;
                position.dir= ++dir;
                push(position);
                row= nextRow;
                col= nextCol;
                dir=0;
            }
            else ++dir;
        }

    }

    if(found){
        display();
    }
    else{
        printf("No route found");
    }






}
