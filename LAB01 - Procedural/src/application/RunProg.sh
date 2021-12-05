gcc -c ../tads/Implementation/ListClient.c -o ListClient.o
gcc -c program.c -o program.o
gcc -o program program.o ../tads/ListClient.h ../tads/Implementation/ListClient.c
rm *.o
./program