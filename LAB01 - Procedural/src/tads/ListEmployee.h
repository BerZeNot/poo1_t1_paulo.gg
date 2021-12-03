#define SUCESS 0
#define INVALID_NULL_POINTER -1
#define OUT_OF_MEMORY -2
#define OUT_OF_RANGE -3
#define ELEM_NOT_FOUND -4

#include "../entity/Employee.c"

typedef struct EmployeeList EmployeeList;

// cria a lista - OK
EmployeeList* employee_list_create();

// libera a lista OK
int employee_list_free(EmployeeList *li);

// insere o aluno no início da lista OK
int employee_list_push_front(EmployeeList *li, Employee emp);

// insere o aluno no final da lista OK
int employee_list_push_back(EmployeeList *li, Employee emp);

// retorna o tamanho da lista (valores negativos em caso de erro) OK
int employee_list_size(EmployeeList *li);

// retira da lista o primeiro aluno OK
int employee_list_pop_front(EmployeeList *li);

// retira da lista o último aluno OK
int employee_list_pop_back(EmployeeList *li);

// retira da lista o aluno da posição 'pos' (posição iniciada em 1) OK
int employee_list_erase_pos(EmployeeList *li, int pos);

// encontrar o aluno pela posição na lista (posição inicia em 1) OK
int employee_list_find_pos(EmployeeList *li, int pos, Employee *emp);

// retornar o aluno que está no final da lista; OK
int employee_list_front(EmployeeList *li, Employee *emp);

// imprime a lista (única função que permite printf!) OK
int employee_list_print(EmployeeList *li);