#include <stdio.h>
#include <string.h>
#include "../entities/Client.c"
#include "../entities/Employee.c"
#include "../entities/Product.c"

int main(){
    Client c1;
    Employee e1;
    Product p1;
    
    printf("<< Client >> \n");
    strcpy(c1.name, "Adamastor da Silva");
    strcpy(c1.cpf, "122.233.344-56");
    c1.cep = 38405219;
    strcpy(c1.birthDate, "24/02/1982");
    
    printf("Name: %s\n", c1.name); 
    printf("CPF: %s\n", c1.cpf);
    printf("CEP: %d\n", c1.cep);
    printf("Birthdate: %s\n", c1.birthDate);
    

    printf("\n<< Employee >> \n");
    strcpy(e1.name, "Beto da Silva");
    strcpy(e1.cpf, "123.133.644-56");
    strcpy(e1.birthDate, "14/02/1983");
    strcpy(e1.entryDate, "12/02/2001");

    printf("Name: %s\n", e1.name); 
    printf("CPF: %s\n", e1.cpf);
    printf("Birth Date: %s\n", e1.birthDate);
    printf("Entry Date: %s\n", e1.entryDate);
    

    printf("\n<< Product >> \n");
    p1.code = 1002;
    strcpy(p1.name, "Notebook");
    strcpy(p1.manufacturer,"DELL");
    p1.price = 7999.00;

    printf("Code: %d\n", p1.code); 
    printf("Name: %s\n", p1.name); 
    printf("Manufacturer: %s\n", p1.manufacturer); 
    printf("Price: %.2lf\n", p1.price); 
    

    return 0;
}
