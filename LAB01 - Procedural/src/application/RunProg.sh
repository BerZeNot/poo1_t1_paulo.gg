gcc -c ../tads/Implementation//ListClient.c -o ListClient.o
gcc -c ../tads/Implementation/ListEmployee.c -o ListEmployee.o
gcc -c ../tads/Implementation/ListProduct.c -o ListProduct.o
gcc -c ../tads/Implementation/ListSale.c -o ListSale.o
gcc -c ../data/FileManipulator.c -o FileManipulator.o
gcc -c program.c -o program.o
gcc -o program program.o ../tads/Implementation/ListClient.c ../tads/Implementation/ListEmployee.c ../tads/Implementation/ListProduct.c ../tads/Implementation/ListSale.c ../tads/ListClient.h ../tads/ListEmployee.h ../tads/ListProduct.h ../tads/ListSale.h
rm *.o
# ./program