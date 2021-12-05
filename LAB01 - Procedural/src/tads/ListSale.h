#define SUCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

#include "../entity/Sale.c"

typedef struct SaleList SaleList;

// cria a lista - OK
SaleList* sale_list_create();

// libera a lista OK
int sale_list_free(SaleList *li);

// insere o aluno no início da lista OK
int sale_list_push_front(SaleList *li, Sale sale);

// insere o aluno no final da lista OK
int sale_list_push_back(SaleList *li, Sale sale);

// retorna o tamanho da lista (valores negativos em caso de erro) OK
int sale_list_size(SaleList *li);

// retira da lista o primeiro aluno OK
int sale_list_pop_front(SaleList *li);

// retira da lista o último aluno OK
int sale_list_pop_back(SaleList *li);

// retira da lista o aluno da posição 'pos' (posição iniciada em 1) OK
int sale_list_erase_pos(SaleList *li, int pos);

// encontrar o aluno pela posição na lista (posição inicia em 1) OK
int sale_list_find_pos(SaleList *li, int pos, Sale *sale);

// retornar o aluno que está no final da lista; OK
int sale_list_front(SaleList *li, Sale *sale);

// imprime a lista (única função que permite printf!) OK
int sale_list_print(SaleList *li);