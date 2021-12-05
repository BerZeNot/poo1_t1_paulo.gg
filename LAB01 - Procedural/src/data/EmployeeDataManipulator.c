#include <stdio.h>
#include <stdlib.h>

// #include "FileManipulator.c"
#include "../tads/ListEmployee.h"

char employeeFileDataPath[] = {"../data/database/Employees.data"};

int saveEmployee(Employee employee){
    
    FILE *fp = openFile(employeeFileDataPath, "ab");

    fwrite(&employee, sizeof(Employee), 1, fp);

    closeFile(fp);
}

int loadEmployeesDataFromFileDataToList(EmployeeList *list){
    FILE *fp = openFile(employeeFileDataPath, "rb");
    Employee auxEmployee;
    while(fread(&auxEmployee, sizeof(Employee), 1, fp)){
        employee_list_push_back(list, auxEmployee);
    }
    closeFile(fp);
    return SUCESS;
}