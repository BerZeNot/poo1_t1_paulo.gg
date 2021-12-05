#include "../entity/Product.c"
#include <stdio.h>
#include <stdlib.h>

char productFileDataPath[] = {"../data/database/Products.data"};


int saveProduct(Product product){
    
    FILE *fp = openFile(productFileDataPath, "ab");

    fwrite(&product, sizeof(Product), 1, fp);

    closeFile(fp);
}