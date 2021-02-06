#include "stdio.h"
#include "stdlib.h"
/*
Stack using dynamic allocation of memory
*/


int *queue;
int capacity=1;
int front=-1;
int rear=-1;



void stackFull(){
    queue = realloc(queue, 2*capacity*sizeof(queue) );
    capacity*=2;
}

void stackEmpty(){
    fprintf(stderr, "Stack is Empty, Cannot remove element.\n STACK UNDERFLOW\n");
    exit(EXIT_FAILURE);
}

void push(int value){

    if(rear>=capacity-1){
        stackFull();

    }
    queue[++rear]= value;
}

void pop(){

    if(front==rear){
        stackEmpty();

    }
    else{
        printf("the first element in the queue is removed :%d\n", queue[++front]);

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

    queue = malloc(capacity*sizeof(int));

    while(l==1){
        printf("\nEnter your choice 1.push 2.pop 3.display 4.exit\n");
        scanf("%d", &ch);
        switch(ch){
            case 1:
                printf("Enter the Value:");
                scanf("%d", &value);
                push(value);
                printf("the updated list is:");
                display();
                break;
            case 2:
                pop();
                printf("the updated list is:\n");
                display();
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
