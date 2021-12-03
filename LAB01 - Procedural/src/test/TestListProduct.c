#include <stdio.h>
#include <string.h>
#include "../tads/ListProduct.h"


int main(){
    Product p1, p2;
    ProductList *list;
    list = product_list_create();

    p1.code = 1001;
    strcpy(p1.name, "Notebook Gamer");
    strcpy(p1.manufacturer, "Hewlett Packard");
    p1.price = 3499.99;

    p2.code = 1002;
    strcpy(p2.name, "Smartphone Samsung Galaxy A32");
    strcpy(p2.manufacturer, "Samsung");
    p2.price = 2399.00;
    
    product_list_push_back(list, p1);
    product_list_push_back(list, p2);
    product_list_print(list);
    printf("%d\n", product_list_size(list));

    return 0;
}
