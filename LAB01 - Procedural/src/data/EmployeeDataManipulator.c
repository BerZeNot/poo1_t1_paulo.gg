#include "../entity/Employee.c"
// #include "FileManipulator.c"
#include <stdio.h>
#include <stdlib.h>

// responsável pela leitura e escrita dos dados nos respectivos arquivos

char employeeFileDataPath[] = {"../data/database/Employees.data"};


int saveEmployee(Employee employee){
    
    FILE *fp = openFile(employeeFileDataPath);

    fwrite(&employee, sizeof(Employee), 1, fp);

    closeFile(fp);
}