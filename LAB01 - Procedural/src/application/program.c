#include <stdio.h>
#include "../util/UI.c"
#include "../data/FileManipulator.c"
#include "../controller/ClientController.c"
#include "../controller/EmployeeController.c"
#include "../controller/ProductController.c"
#include "../controller/SaleController.c"
#include "../controller/ReportsController.c"

int menu();

int main(){
    menu();
    return 0;

}

int menu(){
    int option;
    while(1){
        showStartMenu(); // from /util/UI.c
        printf("| Choose a option: ");
        scanf("%d", &option);
        switch (option) {
        case 1:
            registrateClient();
            break;
        case 2:
            registrateEmployee();
            break;
        case 3:
            registrateProduct();
            break;
        case 4:
            registrateSale();
            break;
        case 5:
            reports();
            break;
        case 0:
            exit(0);
            break;
        default:
            printf("| INVALID OPTION!\n");
            break;
        }

    }
    return 0;
}
