// #include <stdio.h>
#include "../data/EmployeeDataManipulator.c"

int main(){
    EmployeeList *list;    
    list = employee_list_create();
    loadEmployeesDataFromFileDataToList(list);
    employee_list_print(list);
    printf("ListSize: %d\n", employee_list_size(list));
    return 0;
}
