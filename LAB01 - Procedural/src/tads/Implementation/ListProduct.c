#include <stdio.h>
#include <stdlib.h>
#include "../ListProduct.h"

typedef struct list_node list_node;

struct list_node{
    Product data;
    list_node *next;
};

typedef struct ProductList{
    list_node *head;
} ProductList;



ProductList* product_list_create(){
    ProductList *list;
    list = malloc(sizeof(ProductList));
    if(list != NULL){
        list->head = NULL;
        return list;
    }
}

int product_list_free(ProductList *li){
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

int product_list_push_front(ProductList *li, Product prod){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    
    list_node *node;
    node = malloc(sizeof(list_node));
    
    if(node == NULL)
        return OUT_OF_MEMORY;
    
    node->data = prod;

    if(li->head ==NULL){
        li->head = node;
    }
    else{
        node->next = li->head;
        li->head = node;
    }
    return SUCESS;
}

int product_list_push_back(ProductList *li, Product prod){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    
    list_node *node;
    node = malloc(sizeof(list_node));

    if(node == NULL)
        return OUT_OF_MEMORY;
    
    node->data = prod;
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

int product_list_size(ProductList *li){
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

int product_list_pop_front(ProductList *li){
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

int product_list_pop_back(ProductList *li){
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

int product_list_erase_pos(ProductList *li, int pos){
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

int product_list_find_pos(ProductList *li, int pos, Product *prod){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else if(pos <= 0 || pos > product_list_size(li))
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
            *prod = curr->data;
            return SUCESS;
        }
        else
            return ELEM_NOT_FOUND;
    }
}

int product_list_back(ProductList *li, Product *prod){
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
                *prod = curr->data;
                return SUCESS;
            } else {
                return ELEM_NOT_FOUND;
            }
                
        }
    }
}

int product_list_print(ProductList *li){
    if(li == NULL)
        return INVALID_NULL_POINTER;
    else{
        list_node *aux;
        aux = li->head;

        if(aux == NULL)
            return SUCESS;
            
        do{
            printf("------------------\n");
            printf("Code: %d\n", aux->data.code);
            printf("Name: %s\n", aux->data.name);
            printf("Manufacturer: %s\n", aux->data.manufacturer);
            printf("Price: %.2lf\n", aux->data.price);
            aux = aux->next;
        } while(aux!=NULL);
    }
    return SUCESS;
}