#include <stdio.h>
#include <string.h>
#include "../tads/ListEmployee.h"


int main(){
    Employee e1, e2;
    EmployeeList *list;
    list = employee_list_create();

    strcpy(e1.name, "Adamastor Silva");
    strcpy(e1.cpf, "133.122.166-77");
    strcpy(e1.birthDate, "16/04/1982");
    strcpy(e1.entryDate, "12/04/2002");

    strcpy(e2.name, "Gustavo Rocha");
    strcpy(e2.cpf, "127.152.266-25");
    strcpy(e2.birthDate, "09/07/1979");
    strcpy(e2.entryDate, "02/09/1992");

    employee_list_push_back(list, e1);
    employee_list_push_back(list, e2);
    employee_list_print(list);
    printf("%d\n", employee_list_size(list));

    return 0;
}
