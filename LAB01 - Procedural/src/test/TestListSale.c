#include <stdio.h>
#include <string.h>
#include "../tads/ListSale.h"

int main(){
    Sale s1, s2;
    SaleList *list;
    
    ItemSale i1, i2, i3;
    i1.productCode = 10;
    i1.amount = 2;

    i2.productCode = 20;
    i2.amount = 3;

    i3.productCode = 30;
    i3.amount = 1;


    list = sale_list_create();


    strcpy(s1.employeeCPF, "133.133.222.56");
    strcpy(s1.clientCPF, "122.144.333.76");
    s1.productsAmount = 2;
    s1.itemSale[0] = i1;
    s1.itemSale[1] = i3;


    strcpy(s2.employeeCPF, "933.233.922.11");
    strcpy(s2.clientCPF, "455.122.811.22");
    s2.productsAmount = 3;
    s2.itemSale[0] = i1;
    s2.itemSale[1] = i2;
    s2.itemSale[2] = i3;
    
    sale_list_push_back(list, s1);
    sale_list_push_back(list, s2);
    sale_list_print(list);
    printf("%d\n", sale_list_size(list));

    return 0;
}
