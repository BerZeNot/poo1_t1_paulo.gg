#include <stdio.h>
#include <string.h>
// #include "../entity/Client.c"
#include "../data/ClientDataManipulator.c"

void registrateClient(){
    Client newClient;

    ShowClientRegister();
    setbuf(stdin,NULL);
    printf("| Name: ");
    scanf("%[^\n]s", newClient.name);
    printf("| CPF (xxx.xxx.xxx-xx): ");
    scanf("%s", newClient.cpf);
    printf("| Birth Date (dd/MM/yyyy): ");
    scanf("%s", newClient.birthDate);
    printf("| CEP: ");
    scanf("%d", &newClient.cep);
    
    saveClient(newClient);

    printf("| Data saved [Name=%s, CPF=%s, BirthDate=%s, CEP=%d]\n", newClient.name, newClient.cpf, newClient.birthDate, newClient.cep);

}