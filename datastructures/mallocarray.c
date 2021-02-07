#include "stdio.h"
#include "stdlib.h"
#include "macros.h"

int main(){
    int *ptr, *ptr2;
    int n=5, i;
    ptr= malloc(n*sizeof(int));
    ptr2 = calloc(n, sizeof(int));
    for(i=0;i<n;i++){
        ptr[i]=i;
        printf("Malloc %d \n", ptr[i]);
        printf("Calloc %d \n", ptr2[i]);
    }
    ptr = realloc(ptr, 2*sizeof(ptr));
    for(i=0;i<10;i++){
        ptr[i]=i;
        printf("Malloc %d \n", ptr[i]);
    }
}
