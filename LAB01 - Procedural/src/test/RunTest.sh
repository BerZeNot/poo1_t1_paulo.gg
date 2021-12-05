## TestLoadClientsDataFromFile

# gcc -c ../tads/Implementation/ListClient.c -o ListClient.o 
# gcc -c ../data/ClientDataManipulator.c -o ClientDataManipulator.o
# gcc -c ../entity/Client.c -o Client.o
# gcc -c TestLoadClientsDataFromFile.c -o TestLoadClientsDataFromFile.o
# gcc -o TestLoadClientsDataFromFile TestLoadClientsDataFromFile.o ListClient.o ../tads/ListClient.h
# rm *.o
# ./TestLoadClientsDataFromFile

## TestLoadEmployeesDataFromFile

# gcc -c ../tads/Implementation/ListEmployee.c -o ListEmployee.o 
# gcc -c ../data/EmployeeDataManipulator.c -o EmployeeDataManipulator.o
# gcc -c ../entity/Employee.c -o Employee.o
# gcc -c TestLoadEmployeesDataFromFile.c -o TestLoadEmployeesDataFromFile.o
# gcc -o TestLoadEmployeesDataFromFile TestLoadEmployeesDataFromFile.o ListEmployee.o ../tads/ListEmployee.h
# rm *.o
# ./TestLoadEmployeesDataFromFile


## TestLoadProductsDataFromFile

# gcc -c ../tads/Implementation/ListProduct.c -o ListProduct.o 
# gcc -c ../data/ProductDataManipulator.c -o ProductDataManipulator.o
# gcc -c ../entity/Product.c -o Product.o
# gcc -c TestLoadProductsDataFromFile.c -o TestLoadProductsDataFromFile.o
# gcc -o TestLoadProductsDataFromFile TestLoadProductsDataFromFile.o ListProduct.o ../tads/ListProduct.h
# rm *.o
# ./TestLoadProductsDataFromFile

## TestLoadSalesDataFromFile

gcc -c ../tads/Implementation/ListSale.c -o ListSale.o 
gcc -c ../data/SaleDataManipulator.c -o SaleDataManipulator.o
gcc -c ../entity/Sale.c -o Sale.o
gcc -c TestLoadSalesDataFromFile.c -o TestLoadSalesDataFromFile.o
gcc -o TestLoadSalesDataFromFile TestLoadSalesDataFromFile.o ListSale.o ../tads/ListSale.h
rm *.o
./TestLoadSalesDataFromFile