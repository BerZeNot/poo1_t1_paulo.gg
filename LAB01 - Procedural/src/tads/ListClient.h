#define SUCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4
#include "../entity/Client.c"


typedef struct ClientList ClientList;

// cria a lista - OK
ClientList* client_list_create();

// libera a lista OK
int client_list_free(ClientList *li);

// insere o aluno no início da lista OK
int client_list_push_front(ClientList *li, Client cli);

// insere o aluno no final da lista OK
int client_list_push_back(ClientList *li, Client cli);

// retorna o tamanho da lista (valores negativos em caso de erro) OK
int client_list_size(ClientList *li);

// retira da lista o primeiro aluno OK
int client_list_pop_front(ClientList *li);

// retira da lista o último aluno OK
int client_list_pop_back(ClientList *li);

// retira da lista o aluno da posição 'pos' (posição iniciada em 1) OK
int client_list_erase_pos(ClientList *li, int pos);

// encontrar o aluno pela posição na lista (posição inicia em 1) OK
int client_list_find_pos(ClientList *li, int pos, Client *cli);

// retornar o aluno que está no final da lista; OK
int client_list_front(ClientList *li, Client *cli);

// imprime a lista (única função que permite printf!) OK
int client_list_print(ClientList *li);