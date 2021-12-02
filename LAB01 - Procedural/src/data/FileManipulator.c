#include <stdio.h>

FILE *openFile(char *fileName){
    FILE *fp = fopen(fileName, "ab");
    if(fp == NULL){
        fp = fopen(fileName, "wb");
        if(fp == NULL){
            printf("Can't open file!\n");
            fclose(fp);
            return NULL;
        }
    }
    return fp;  
}

void *closeFile(FILE *fp){
    fclose(fp);
}