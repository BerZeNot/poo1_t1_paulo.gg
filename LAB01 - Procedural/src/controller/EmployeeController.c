#include <stdio.h>
#include <string.h>
#include "../data/EmployeeDataManipulator.c"

void registrateEmployee(){
    Employee newEmployee;

    ShowEmployeeRegister();
    setbuf(stdin,NULL);
    printf("| Name: ");
    scanf("%[^\n]s", newEmployee.name);
    printf("| CPF (xxx.xxx.xxx-xx): ");
    scanf("%s", newEmployee.cpf);
    printf("| Birth Date (dd/MM/yyyy): ");
    scanf("%s", newEmployee.birthDate);
    printf("| Entry Date (dd/MM/yyyy): ");
    scanf("%s", newEmployee.entryDate);
    
    saveEmployee(newEmployee);

    printf("| Data saved [Name=%s, CPF=%s, BirthDate=%s, EntryDate=%s]\n", newEmployee.name, newEmployee.cpf, newEmployee.birthDate, newEmployee.entryDate);

}