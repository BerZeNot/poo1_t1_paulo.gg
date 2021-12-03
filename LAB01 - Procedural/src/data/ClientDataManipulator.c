#include "../entity/Client.c"
#include "FileManipulator.c"
#include <stdio.h>
#include <stdlib.h>

char clientFileDataPath[] = {"../data/database/Clients.data"};


int saveClient(Client client){
    
    FILE *fp = openFile(clientFileDataPath);

    fwrite(&client, sizeof(Client), 1, fp);

    closeFile(fp);
}