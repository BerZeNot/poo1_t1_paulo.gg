#include <stdio.h>
#include <stdlib.h>

char saleFileDataPath[] = {"../data/database/Sales.data"};

int saveSale(Sale sale){
    
    FILE *fp = openFile(saleFileDataPath, "ab");

    fwrite(&sale, sizeof(Sale), 1, fp);

    closeFile(fp);
}