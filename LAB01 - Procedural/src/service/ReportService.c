// #include "../tads/ListClient.h"
void showAllClients(){
    ClientList *list;
    list = client_list_create();
    loadClientsDataFromFileDataToList(list);
    client_list_print(list);
}

void showAllEmployees(){
    EmployeeList *list;
    list = employee_list_create();
    loadEmployeesDataFromFileDataToList(list);
    employee_list_print(list);
}

void showAllProducts(){
    ProductList *list;
    list = product_list_create();
    loadProductsDataFromFileDataToList(list);
    product_list_print(list);
}

void showAllSales(){
    SaleList *list;
    list = sale_list_create();
    loadSalesDataFromFileDataToList(list);
    sale_list_print(list);
}