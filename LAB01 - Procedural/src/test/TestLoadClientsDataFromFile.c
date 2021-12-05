// #include <stdio.h>
#include "../data/ClientDataManipulator.c"

int main(){
    ClientList *list;    
    list = client_list_create();
    loadClientsDataFromFileDataToList(list);
    client_list_print(list);
    printf("ListSize: %d\n", client_list_size(list));
    return 0;
}
