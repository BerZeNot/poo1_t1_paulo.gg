// #include "../entity/Sale.c"
#include "../data/SaleDataManipulator.c"

void registrateSale(){
    Sale newSale;
    char registerOther = 'y';
    ShowSaleRegister();
    printf("| Employee CPF: ");
    scanf("%s", newSale.employeeCPF);

    printf("| Client CPF: ");
    scanf("%s", newSale.clientCPF);
    
    printf("\n| << Products data >>\n");
    int nextFreePositionOnItemSaleArray = 0;

    do{
        ItemSale is;
        printf("Product Code: ");
        scanf("%d", &is.productCode);

        printf("Amount: ");
        scanf("%d", &is.amount);
        
        newSale.itemSale[nextFreePositionOnItemSaleArray] = is;
        nextFreePositionOnItemSaleArray ++;

        do{
            printf("Registrate other product? (y/n): ");
            setbuf(stdin, NULL);
            scanf("%c", &registerOther);
            
            if (registerOther != 'y' && registerOther != 'n' && registerOther != 'Y' && registerOther != 'Y'){
                printf("Invalid option! Type only 'y' or 'n'.\n");
            }
        } while (registerOther != 'y' && registerOther != 'n' && registerOther != 'Y' && registerOther != 'Y');
        

    } while(registerOther == 'y' || registerOther == 'Y');

    newSale.productsAmount = nextFreePositionOnItemSaleArray;
    
    saveSale(newSale);

    printf("| Data saved [EmployeeCPF=%s, ClientCPF=%s]\n", newSale.employeeCPF, newSale.clientCPF);

}