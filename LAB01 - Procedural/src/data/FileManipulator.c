// #include <stdio.h>

FILE *openFile(char *fileName, char *openingMode){
    FILE *fp = fopen(fileName, openingMode);
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

void closeFile(FILE *fp){
    fclose(fp);
}