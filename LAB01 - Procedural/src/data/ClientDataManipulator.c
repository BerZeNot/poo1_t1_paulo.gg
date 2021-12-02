#include "../entity/Client.c"
#include "FileManipulator.c"
#include <stdio.h>
#include <stdlib.h>

// responsável pela leitura e escrita dos dados nos respectivos arquivos

char clientFileDataPath[] = {"../data/database/Clients.data"};


int saveClient(Client client){
    
    FILE *fp = openFile(clientFileDataPath);

    fwrite(&client, sizeof(Client), 1, fp);

    closeFile(fp);
}