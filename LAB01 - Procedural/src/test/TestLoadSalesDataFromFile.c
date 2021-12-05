// #include <stdio.h>
#include "../data/SaleDataManipulator.c"

int main(){
    SaleList *list;    
    list = sale_list_create();
    loadSalesDataFromFileDataToList(list);
    sale_list_print(list);
    printf("ListSize: %d\n", sale_list_size(list));
    return 0;
}
