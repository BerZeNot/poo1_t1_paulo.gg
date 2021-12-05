#include "../entity/Employee.c"
#include <stdio.h>
#include <stdlib.h>

char employeeFileDataPath[] = {"../data/database/Employees.data"};

int saveEmployee(Employee employee){
    
    FILE *fp = openFile(employeeFileDataPath, "ab");

    fwrite(&employee, sizeof(Employee), 1, fp);

    closeFile(fp);
}