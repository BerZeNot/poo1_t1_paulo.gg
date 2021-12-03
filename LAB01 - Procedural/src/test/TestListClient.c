#include <stdio.h>
#include <string.h>
#include "../tads/ListClient.h"


int main(){
    Client c1, c2;
    ClientList *list;
    list = list_create();

    strcpy(c1.name, "Adamastor Silva");
    strcpy(c1.cpf, "133.122.166-77");
    strcpy(c1.birthDate, "16/04/1982");
    c1.cep = 24715-000;

    strcpy(c2.name, "Gustavo Rocha");
    strcpy(c2.cpf, "127.152.266-25");
    strcpy(c2.birthDate, "09/07/1979");
    c2.cep = 39722-020;
    
    list_push_back(list, c1);
    list_push_back(list, c2);
    list_print(list);

    return 0;
}
