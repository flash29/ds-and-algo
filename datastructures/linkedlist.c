#include "stdio.h"
#include "stdlib.h"

int capacity=1;



struct node{
    int data;
    struct node *next;
};

struct node *head = NULL;
struct node *temp = NULL;



void add(int value){
    struct node  *assign;
    assign = malloc(sizeof(struct node));
    assign->data = value;
    assign->next = NULL;
    if (head==NULL){
        head = assign;
    }
    else{
        temp= head;
        while(temp->next!=NULL){
            temp= temp->next;
        }
        temp->next=assign;
    }

}

void pop(int index){
    int counter=0,i;
    struct node *prev = NULL;
    temp=head;
    if(index==1){
        head= temp->next;
        free(temp);
    }
    else{
        for(i=1;i<index;i++){
            prev = temp;
            temp= temp->next;
        }
        prev->next= temp->next;
        free(temp);
    }



}

void print(){
    temp= head;
    printf("\nThe list is :\n");
    while(temp != NULL){
        printf("%d\t", temp->data);
        temp=temp->next;
    }
   
    printf("\n");
}



int main(){

    int l=1,ch, value, index;
    while(l==1){
        printf("Enter your choice 1. add 2. delete 3. display 4. exit");
        scanf("%d", &ch);
        switch(ch){
            case 1 :
                printf("Enter the value");
                scanf("%d", &value );
                add(value);
                print();
                break;
            case 2 :
                printf("enter the index");
                scanf("%d", &index);
                pop(index);
                print();
                break;
            case 3 :
                print();
                break;
            case 4:
                l=0;
                break;
            default :
                printf("Wrong Input");
        }

    }
}
