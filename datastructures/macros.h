#include<stdio.h>
#include<stdlib.h>

//For Calloc
/*
Calloc allocates a user specified memory and initialises the allocated memory to 0.
A pointer to the start of the allocated memory is returned.
*/
// void MALLOC(){
//
// }


#define CALLOC(p, n, s)\
            if(!((p) = calloc(n, s) ) ){\
                fprintf("Insufficient Memory");\
                exit(EXIT_FAILURE);\
            }


// For Malloc
#define MALLOC(p,s)\
        if(!( (p) = malloc(s) )) {\
            fprintf("Insufficient Memory");\
            exit(EXIT_FAILURE);\
        }

// For realloc
/*
it resizes the memory previously allocated by either malloc or calloc.
realloc(p, s) : changes the size of the memory block pointed at by "p" to "s".
*/
#define REALLOC(p,s)\
        if(!( (p) = realloc(p, s) )) {\
            fprintf("Insufficient Memory");\
            exit(EXIT_FAILURE);\
        }
