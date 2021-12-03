#include "ItemSale.c"

typedef struct Sale{
    char employeeCPF[15];
    char clientCPF[15];
    ItemSale itemSale[100];
    int productsAmount;
} Sale;