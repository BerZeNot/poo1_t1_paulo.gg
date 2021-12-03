#include <stdio.h>
#include <stdlib.h>
#include "../ListClient.h"

typedef struct list_node list_node;

struct list_node{
    Client data;
    list_node *next;
};

struct ClientList{
    list_node *head;
};



ClientList* client_list_create(){
    ClientList *list;
    list = malloc(sizeof(ClientList));
    if(list != NULL){
        list->head = NULL;
        return list;
    }
}

int client_list_free(ClientList *li){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else{
        list_node *aux;
        aux = li->head;
        if(aux == NULL){
            free(li);
            return SUCESS;
        } else {
            while(aux != NULL){
                li->head = aux->next;
                free(aux);
                aux = li->head;
            }
            free(li);
            return SUCESS;
        }
    }
}

int client_list_push_front(ClientList *li, Client cli){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    
    list_node *node;
    node = malloc(sizeof(list_node));
    
    if(node == NULL)
        return OUT_OF_MEMORY;
    
    node->data = cli;

    if(li->head ==NULL){
        li->head = node;
    }
    else{
        node->next = li->head;
        li->head = node;
    }
    return SUCESS;
}

int client_list_push_back(ClientList *li, Client cli){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    
    list_node *node;
    node = malloc(sizeof(list_node));

    if(node == NULL)
        return OUT_OF_MEMORY;
    
    node->data = cli;
    node->next = NULL;

    if(li->head == NULL)
        li->head = node;
    else{
        list_node *aux;
        aux = li->head;
        while(aux->next!=NULL){
            aux = aux->next;
        }
        aux->next = node;
    }
    return SUCESS;
}

int client_list_size(ClientList *li){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    if(li->head == NULL)
        return 0;

    int size=0;
    list_node *aux;
    aux = li->head;
    size++;
    while(aux->next!= NULL){
        size++;
        aux = aux->next;
    }
    return size;
}

int client_list_pop_front(ClientList *li){
    if(li == NULL)
        return INVALID_NULL_POINTER;

    else{
        if(li->head == NULL)
            return SUCESS;
        else{
            list_node *aux;
            aux = li->head;
            li->head = li->head->next;
            free(aux);
            return SUCESS;
        }
    } 
};

int client_list_pop_back(ClientList *li){
    if(li == NULL)
        return SUCESS;
    else{
        if(li->head == NULL)
            return SUCESS;
        else{
            list_node *prev, *curr;
            prev = li->head;
            curr = li->head;

            while(curr->next != NULL){
                prev = curr;
                curr = curr->next;
            }
            prev->next = NULL;
            free(curr);
            return SUCESS;
        }
    }
}

int client_list_erase_pos(ClientList *li, int pos){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    
    else if(pos <=0)
        return OUT_OF_RANGE;

    else{
        if(li->head == NULL)
            return ELEM_NOT_FOUND;
        else{
            int currPos = 1; // Current Position
            list_node *prev, *curr;
            prev = li->head;
            curr = li->head;
            while(curr->next != NULL && currPos < pos){
                prev = curr;
                curr = curr->next;
                currPos++;
            }
            if(currPos == pos){
                prev->next = curr->next;
                free(curr);
                return SUCESS;
            }
            else
                return ELEM_NOT_FOUND;
        }
    }
}

int client_list_find_pos(ClientList *li, int pos, Client *cli){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else if(pos <= 0 || pos > client_list_size(li))
        return OUT_OF_RANGE;
    else {
        int currPos = 1; // Current Position
        list_node *curr;
        curr = li->head;
        while(currPos < pos && curr->next != NULL){
            currPos++;
            curr = curr->next;
        }
        if(currPos == pos){
            *cli = curr->data;
            return SUCESS;
        }
        else
            return ELEM_NOT_FOUND;
    }
}

int client_list_back(ClientList *li, Client *cli){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else{
        if(li->head == NULL)
            return ELEM_NOT_FOUND;
        else{
            list_node *curr;
            curr = li->head;
            while(curr->next != NULL)
                curr = curr->next;
            
            if(curr->next == NULL){
                *cli = curr->data;
                return SUCESS;
            } else {
                return ELEM_NOT_FOUND;
            }
                
        }
    }
}

int client_list_print(ClientList *li){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else{
        list_node *aux;
        aux = li->head;

        if(aux == NULL)
            return SUCESS;
            
        do{
            printf("------------------\n");
            printf("Name: %s\n", aux->data.name);
            printf("CPF: %s\n", aux->data.cpf);
            printf("Birth Date: %s\n", aux->data.birthDate);
            printf("CEP: %d\n", aux->data.cep);

            aux = aux->next;
        } while(aux!=NULL);
    }
    return SUCESS;
}