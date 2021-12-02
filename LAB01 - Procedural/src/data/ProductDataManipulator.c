#include "../entity/Product.c"
// #include "FileManipulator.c"
#include <stdio.h>
#include <stdlib.h>

// responsável pela leitura e escrita dos dados nos respectivos arquivos

char productFileDataPath[] = {"../data/database/Products.data"};


int saveProduct(Product product){
    
    FILE *fp = openFile(productFileDataPath);

    fwrite(&product, sizeof(Product), 1, fp);

    closeFile(fp);
}