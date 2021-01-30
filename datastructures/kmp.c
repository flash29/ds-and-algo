#include "stdio.h"
#include "string.h"

#define PATTERN_MAX 100
#define STRING_MAX 100

char pattern[PATTERN_MAX];
char string[STRING_MAX];
int failure[PATTERN_MAX];

void fail(){

    int i;

    failure[0]= -1;

    for (int j=1; j<strlen(pattern); j++){
        i= failure[j-1];

        while(pattern[j] != pattern[i+1] && i>=0 ){
            i= failure[i];
        }

        if(pattern[j]==pattern[i+1]){
            failure[j]= i+1;
        }
        else{
            failure[j]=-1;
        }
    }
}

int find(){
    int slen= strlen(string);
    int spat= strlen(pattern);
    int i=0,j=0;
    while(i<slen && j<spat){
        if (string[i] == pattern[j]){
            i++;
            j++;
        }
        else if (j==0){
            i++;
        }
        else{
            j= failure[j-1]+1;
        }

    }
    return ( (j==spat) ? (i- spat) : -1);
}

int main(){
    int i, result;
    strcpy(string, "defabcabdX" );
    strcpy(pattern, "ababaa" );
    fail();


    printf("The string is : %s\n", string);
    printf("The pattern is : %s\n", pattern);
    printf("The failure Array is\n");
    for(i=0;i< strlen(pattern);i++){
        printf("%d\t", failure[i]);
    }
    result = find();
    printf("The result is %d\n", result);
}
