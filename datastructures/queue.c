#include "stdio.h"
#include "stdlib.h"
int front = -1;
int rear= -1;
#define MAX_SIZE 5
int queue[MAX_SIZE];

/*
queue implementation
*/

void queueFull(){
    fprintf(stderr, "Stack is Full.\n STACK OVERFLOW\n");
    exit(EXIT_FAILURE);
}

void queueEmpty(){
    fprintf(stderr, "Stack is Empty, Cannot remove element.\n STACK UNDERFLOW\n");
    exit(EXIT_FAILURE);
}

void push(int value){

    if(rear>=MAX_SIZE-1){
        queueFull();

    }

    queue[++rear]= value;
}

void pop(){

    if(front==rear){
        queueEmpty();
    }
    else{
        printf("the first element in the queue is removed : %d\n", queue[++front]);
    }
}

void display(){
    int i;
    for(i=front+1;i<=rear;i++){
        printf("%d\t", queue[i]);
    }
}

int main(){

    int ch, value, l=1;


    while(l==1){
        printf("\nEnter your choice for queue 1.push 2.pop 3.display 4.exit\n");
        scanf("%d", &ch);
        switch(ch){
            case 1:
                printf("Enter the Value:");
                scanf("%d", &value);
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                l=0;
                break;
            default:
                printf("Wrong Input ");
        }


    }


}
