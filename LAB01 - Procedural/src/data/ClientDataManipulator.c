#include <stdio.h>
#include <stdlib.h>

#include "FileManipulator.c"
#include "../tads/ListClient.h"

char clientFileDataPath[] = {"../data/database/Clients.data"};


int saveClient(Client client){
    
    FILE *fp = openFile(clientFileDataPath, "ab");

    fwrite(&client, sizeof(Client), 1, fp);

    closeFile(fp);
}

int loadClientsDataFromFileDataToList(ClientList *list){
    FILE *fp = openFile(clientFileDataPath, "rb");
    Client auxClient;
    while(fread(&auxClient, sizeof(Client), 1, fp)){
        client_list_push_back(list, auxClient);
    }
    closeFile(fp);
    return SUCESS;
}