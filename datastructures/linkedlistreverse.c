#include "stdio.h"
#include "stdlib.h"

struct node {
    int data;
    struct node *next;
};

struct node *head = NULL;
struct node *temp = NULL;

void reverse(){
    struct node *prev,*curr, *tempNext;
    curr=head;
    prev=NULL;
    tempNext= NULL;

    while(curr != NULL){
        tempNext = curr->next;
        curr->next = prev;
        prev= curr;
        curr=tempNext;
    }
    head= prev;
    
    

}

void traverse(){
    temp= head;
    printf("\nThe list is :\n");
    while(temp != NULL){
        printf("%d\t", temp->data);
        temp=temp->next;
    }
    printf("\n");
}



int main(){
    struct node *first, *second, *third, *four;
    first=malloc(sizeof(struct node));
    second=malloc(sizeof(struct node));
    third=malloc(sizeof(struct node));
    four=malloc(sizeof(struct node));
    first->data=10;
    first->next=second;
    head= first;
    second->data=20;
    second->next=third;
    third->data=30;
    third->next=four;
    four->data=40;
    four->next= NULL;
    printf("The linked list before reversing");
    traverse();
    reverse();
    printf("after reversing the linnked list");
    traverse();
}