#include <stdio.h>
#include <stdlib.h>
#include "../ListSale.h"

typedef struct list_node list_node;

struct list_node{
    Sale data;
    list_node *next;
};

typedef struct SaleList{
    list_node *head;
} SaleList;



SaleList* sale_list_create(){
    SaleList *list;
    list = malloc(sizeof(SaleList));
    if(list != NULL){
        list->head = NULL;
        return list;
    }
}

int sale_list_free(SaleList *li){
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

int sale_list_push_front(SaleList *li, Sale sale){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    
    list_node *node;
    node = malloc(sizeof(list_node));
    
    if(node == NULL)
        return OUT_OF_MEMORY;
    
    node->data = sale;

    if(li->head ==NULL){
        li->head = node;
    }
    else{
        node->next = li->head;
        li->head = node;
    }
    return SUCESS;
}

int sale_list_push_back(SaleList *li, Sale sale){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    
    list_node *node;
    node = malloc(sizeof(list_node));

    if(node == NULL)
        return OUT_OF_MEMORY;
    
    node->data = sale;
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

int sale_list_size(SaleList *li){
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

int sale_list_pop_front(SaleList *li){
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

int sale_list_pop_back(SaleList *li){
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

int sale_list_erase_pos(SaleList *li, int pos){
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

int sale_list_find_pos(SaleList *li, int pos, Sale *sale){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else if(pos <= 0 || pos > sale_list_size(li))
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
            *sale = curr->data;
            return SUCESS;
        }
        else
            return ELEM_NOT_FOUND;
    }
}

int sale_list_back(SaleList *li, Sale *sale){
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
                *sale = curr->data;
                return SUCESS;
            } else {
                return ELEM_NOT_FOUND;
            }
                
        }
    }
}

int sale_list_print(SaleList *li){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else{
        list_node *aux;
        aux = li->head;

        if(aux == NULL)
            return SUCESS;
            
        do{
            printf("------------------\n");
            printf("Employee CPF: %s\n", aux->data.employeeCPF);
            printf("Client CPF: %s\n", aux->data.clientCPF);
            printf("Total amount of products: %d\n", aux->data.productsAmount);
            printf("Products: \n");
            for(int i=0; i < aux->data.productsAmount; i++){
                printf("-> Code: %d, Amount: %d\n", aux->data.itemSale[i].productCode, aux->data.itemSale[i].amount);
            }
            aux = aux->next;
        } while(aux!=NULL);
    }
    return SUCESS;
}