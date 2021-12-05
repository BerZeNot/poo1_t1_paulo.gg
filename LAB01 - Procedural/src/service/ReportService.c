// #include <stdlib.h>
// #include "../tads/ListProduct.h"
// #include "../tads/ListSale.h"

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

void findBestSellerProduct(){
    ProductList *listProducts;
    SaleList *listSales;
    Product currentProduct;
    Product bestSellerProduct;
    Sale currenSale;

    int *totalOfEachSoldProduct;
    int totalOfProducts;
    int totalOfSales;
    int sumOfProductsAmountEachSale = 0;
    int positionOfBestSellerProduct;
    listProducts = product_list_create();
    listSales = sale_list_create();

    loadProductsDataFromFileDataToList(listProducts);
    loadSalesDataFromFileDataToList(listSales);
    

    totalOfProducts = product_list_size(listProducts);
    totalOfSales = sale_list_size(listSales);

    totalOfEachSoldProduct = malloc(totalOfProducts*sizeof(int));

    for(int i = 0; i < totalOfProducts; i++){
        product_list_find_pos(listProducts, i+1, &currentProduct);
        for(int j = 1; j <= totalOfSales; j++){
            sale_list_find_pos(listSales, j, &currenSale);
            for(int k=0; k < currenSale.productsAmount; k++){
                if(currenSale.itemSale[k].productCode == currentProduct.code){
                    sumOfProductsAmountEachSale += currenSale.itemSale[k].amount;
                }
            }
        }
        totalOfEachSoldProduct[i] = sumOfProductsAmountEachSale;
        sumOfProductsAmountEachSale = 0;
    }

    int aux=0;
    for(int i=0; i < totalOfProducts; i++){
        if(totalOfEachSoldProduct[i] > aux){
            aux = totalOfEachSoldProduct[i];
            positionOfBestSellerProduct = i;
        }
    }

    product_list_find_pos(listProducts, positionOfBestSellerProduct+1, &bestSellerProduct);
    
    printf("| The best seller product is %s with %d sales.\n", bestSellerProduct.name, aux);

}