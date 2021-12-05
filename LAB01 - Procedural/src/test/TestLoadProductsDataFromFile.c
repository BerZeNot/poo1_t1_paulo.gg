// #include <stdio.h>
#include "../data/ProductDataManipulator.c"

int main(){
    ProductList *list;    
    list = product_list_create();
    loadProductsDataFromFileDataToList(list);
    product_list_print(list);
    printf("ListSize: %d\n", product_list_size(list));
    return 0;
}
