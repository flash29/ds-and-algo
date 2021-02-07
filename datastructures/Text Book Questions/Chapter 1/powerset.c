#include "stdio.h"
#include "string.h"
//adding new lines from emacs
void powerset(char *list, char *subset , int index, int n){
    if (index == n ){

        for (int i=0;i<strlen(subset);i++){

            if (subset[i]==' '){
            }
            else{
                printf("%c,", subset[i]);
            }
        }
        printf("\n");

    }
    else{
        subset[index]= ' ';
        powerset(list, subset, index+1, n);
        subset[index]= list[index];
        powerset(list, subset, index+1, n);

    }
}

int main(){
    char list[]={'a', 'b', 'c'};
    int n=sizeof(list)/ sizeof(list[0]);
    char subset[n];

    powerset(list, subset , 0, n);


    return 0;
}
