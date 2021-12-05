void reports(){
    int option;
    do{
        ShowReportsOptions();
        printf("| Choose a option: ");
        scanf("%d", &option);
        switch (option) {
        case 0:
            printf("| Back\n");
            break;

        case 1:
            printf("| List all Clients\n");
            break;
      
        case 2:
            printf("| List all Employees\n");
            break;

        case 3:
            printf("| List all Products\n");
            break;

        case 4:
            printf("| List all Sales\n");
            break;

        case 5:
            printf("| Best selling product\n");
            break;
        case 6:
            printf("| Customer who spends the most\n");
            break;

        default:
            printf("| Invalid option!\n");
            break;
        }
    } while(option != 0);
}