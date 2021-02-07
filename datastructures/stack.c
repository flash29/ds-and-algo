#include "stdio.h"
#include "stdlib.h"
int top = -1;
#define MAX_SIZE 10
int stack[MAX_SIZE];

/*
Stack implementation
*/

void stackFull(){
    fprintf(stderr, "Stack is Full.\n STACK OVERFLOW\n");
    exit(EXIT_FAILURE);
}

void stackEmpty(){
    fprintf(stderr, "Stack is Empty, Cannot remove element.\n STACK UNDERFLOW\n");
    exit(EXIT_FAILURE);
}

void push(int value){

    if(top>=MAX_SIZE-1){
        stackFull();

    }
    else{
        stack[++top]= value;
    }
}

int pop(){

    if(top==-1){
        stackEmpty();
        return -1;
    }
    else{
        printf("the top element in the stack is removed\n");
        return stack[--top];
    }
}

void display(){
    int i;
    for(i=0;i<=top;i++){
        printf("%d\t", stack[i]);
    }
}

int main(){

    int ch, value, l=1;


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
