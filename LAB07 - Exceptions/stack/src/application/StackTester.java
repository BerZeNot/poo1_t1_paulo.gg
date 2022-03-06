package application;

import entities.Stack;
import exceptions.DataNotFoundException;
import exceptions.VoidListException;

public class StackTester {

    public static void main(String[] args) {

        Stack st = new Stack();
        for(int i = 10; i<100; i+=10){
            st.push(i);
        }

        try {
            System.out.println("<< Current stack size: " + st.size() + " >>");

            st.print();
            System.out.println("Stack top: " + st.top());


            for(int i=0; i<3; i++){
                st.pop();
            }

            System.out.println("After remove 3 elements");
            st.print();
        } catch (VoidListException e){
            System.out.println(e.getMessage());
        } catch (DataNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
