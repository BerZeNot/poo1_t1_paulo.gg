#include <stdio.h>
#include <stdlib.h>

// #include "FileManipulator.c"
#include "../tads/ListProduct.h"
char productFileDataPath[] = {"../data/database/Products.data"};


int saveProduct(Product product){
    
    FILE *fp = openFile(productFileDataPath, "ab");

    fwrite(&product, sizeof(Product), 1, fp);

    closeFile(fp);
}

int loadProductsDataFromFileDataToList(ProductList *list){
    FILE *fp = openFile(productFileDataPath, "rb");
    Product auxProduct;
    while(fread(&auxProduct, sizeof(Product), 1, fp)){
        product_list_push_back(list, auxProduct);
    }
    closeFile(fp);
    return SUCESS;
}