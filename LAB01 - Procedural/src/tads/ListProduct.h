#define SUCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

#include "../entity/Product.c"

typedef struct ProductList ProductList;

// cria a lista - OK
ProductList* product_list_create();

// libera a lista OK
int product_list_free(ProductList *li);

// insere o aluno no início da lista OK
int product_list_push_front(ProductList *li, Product prod);

// insere o aluno no final da lista OK
int product_list_push_back(ProductList *li, Product prod);

// retorna o tamanho da lista (valores negativos em caso de erro) OK
int product_list_size(ProductList *li);

// retira da lista o primeiro aluno OK
int product_list_pop_front(ProductList *li);

// retira da lista o último aluno OK
int product_list_pop_back(ProductList *li);

// retira da lista o aluno da posição 'pos' (posição iniciada em 1) OK
int product_list_erase_pos(ProductList *li, int pos);

// encontrar o aluno pela posição na lista (posição inicia em 1) OK
int product_list_find_pos(ProductList *li, int pos, Product *prod);

// retornar o aluno que está no final da lista; OK
int product_list_front(ProductList *li, Product *prod);

// procura um produto na lista dado um código de produto
int product_list_find_code(ProductList *li, int code, Product *prod){

// imprime a lista (única função que permite printf!) OK
int product_list_print(ProductList *li);