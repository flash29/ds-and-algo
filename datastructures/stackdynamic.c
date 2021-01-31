#include "stdio.h"
#include "stdlib.h"
/*
Stack using dynamic allocation of memory
*/


int *ptr;
int capacity=1;
int top=-1;



void stackFull(){
    ptr = realloc(ptr, 2*capacity*sizeof(ptr) );
    capacity*=2;
}

void stackEmpty(){
    fprintf(stderr, "Stack is Empty, Cannot remove element.\n STACK UNDERFLOW\n");
    exit(EXIT_FAILURE);
}

void push(int value){

    if(top>=capacity-1){
        stackFull();

    }
    ptr[++top]= value;
}

int pop(){

    if(top==-1){
        stackEmpty();
        return -1;
    }
    else{
        printf("the top element in the stack is removed\n");
        return ptr[--top];
    }
}

void display(){
    int i;
    for(i=0;i<=top;i++){
        printf("%d\t", ptr[i]);
    }
}

int main(){

    int ch, value, l=1;

    ptr = malloc(capacity*sizeof(int));

    while(l==1){
        printf("\nEnter your choice 1.push 2.pop 3.display 4.exit\n");
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
