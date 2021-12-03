#include <stdio.h>
#include <string.h>
#include "../data/ProductDataManipulator.c"

void registrateProduct(){
    Product newProduct;

    ShowProductRegister();
    
    printf("| Code: ");
    scanf("%d", &newProduct.code);
    
    setbuf(stdin,NULL);
    printf("| Name: ");
    scanf("%[^\n]s", newProduct.name);

    printf("| Manufacturer: ");
    scanf("%s", newProduct.manufacturer);

    printf("| Price: ");
    scanf("%lf", &newProduct.price);

    saveProduct(newProduct);

    printf("| Data saved [Code=%d, Name=%s, Manufacturer=%s, Price=%.2lf]\n", newProduct.code, newProduct.name, newProduct.manufacturer, newProduct.price);

}