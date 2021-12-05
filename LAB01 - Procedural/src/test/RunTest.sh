gcc -c ../tads/Implementation/ListClient.c -o ListClient.o 
gcc -c ../data/ClientDataManipulator.c -o ClientDataManipulator.o
gcc -c ../entity/Client.c -o Client.o
gcc -c TestLoadClientsDataFromFile.c -o TestLoadClientsDataFromFile.o
# gcc -o TestLoadClientsDataFromFile TestLoadClientsDataFromFile.o Client.o ListClient.o ../tads/ListClient.h ClientDataManipulator.o
gcc -o TestLoadClientsDataFromFile TestLoadClientsDataFromFile.o ListClient.o ../tads/ListClient.h
rm *.o
./TestLoadClientsDataFromFile