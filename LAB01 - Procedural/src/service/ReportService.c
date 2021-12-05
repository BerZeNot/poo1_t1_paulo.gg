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

void findTheBiggestConsumer(){
    ClientList *listClients;
    ProductList *listProducts;
    SaleList *listSales;

    Client currentClient;
    Client biggestConsumer;
    Product productAux;
    Sale currentSale;
    
    listClients = client_list_create();
    listProducts = product_list_create();
    listSales = sale_list_create();

    loadClientsDataFromFileDataToList(listClients);
    loadProductsDataFromFileDataToList(listProducts);
    loadSalesDataFromFileDataToList(listSales);

    int clientsAmount;
    int salesAmount;
    double *spendAmountOfEachClient;
    double sumOfExpenses=0.0;

    clientsAmount = client_list_size(listClients);
    salesAmount = sale_list_size(listSales);

    spendAmountOfEachClient = malloc(clientsAmount * sizeof(double));

    for(int i = 0; i < clientsAmount; i++){
        client_list_find_pos(listClients, i+1, &currentClient);
        
        for(int j = 1; j <= salesAmount; j++){
            sale_list_find_pos(listSales, j, &currentSale);

            if(strcmp(currentClient.cpf, currentSale.clientCPF) == 0){
                for(int k = 0; k < currentSale.productsAmount; k++){
                    product_list_find_code(listProducts, currentSale.itemSale[k].productCode,&productAux);
                    sumOfExpenses += productAux.price * currentSale.itemSale[k].amount;
                }
            }
        }
        spendAmountOfEachClient[i] = sumOfExpenses;
        sumOfExpenses = 0.0;
    }

    double auxBiggestSpend = 0.0;
    int positionOfBiggestExpend = 0;
    for(int i=0; i < clientsAmount; i++){
        if(spendAmountOfEachClient[i] > auxBiggestSpend){
            auxBiggestSpend = spendAmountOfEachClient[i];
            positionOfBiggestExpend = i;
        }
    }

    client_list_find_pos(listClients, positionOfBiggestExpend+1, &biggestConsumer);

    printf("| The biggest consumer is %s with %.2f spent.\n", biggestConsumer.name, spendAmountOfEachClient[positionOfBiggestExpend]);

}