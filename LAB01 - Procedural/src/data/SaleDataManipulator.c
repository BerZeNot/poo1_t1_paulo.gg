#include <stdio.h>
#include <stdlib.h>

// #include "FileManipulator.c"
#include "../tads/ListSale.h"

char saleFileDataPath[] = {"../data/database/Sales.data"};

int saveSale(Sale sale){
    
    FILE *fp = openFile(saleFileDataPath, "ab");

    fwrite(&sale, sizeof(Sale), 1, fp);

    closeFile(fp);
}

int loadSalesDataFromFileDataToList(SaleList *list){
    FILE *fp = openFile(saleFileDataPath, "rb");
    Sale auxSale;
    while(fread(&auxSale, sizeof(Sale), 1, fp)){
        sale_list_push_back(list, auxSale);
    }
    closeFile(fp);
    return SUCESS;
}