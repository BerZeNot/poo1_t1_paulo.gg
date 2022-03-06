package application;

import entities.LinkedList;
import exceptions.DataNotFoundException;
import exceptions.VoidListException;

public class ProgramListTester {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        boolean pushback = true;

        try {

            for (int i = 1; i <= 10; i++) {
                if (i > 2)
                    pushback = (pushback) ? true : false;
                if (pushback)
                    list.push_back(i);
                else
                    list.push_front(i);
            }

            list.printList();
            System.out.println("\n");
            while (list.getSize() > 0) {
                System.out.println("Will pop back");
                System.out.println("Current list size: " + list.getSize());
                list.pop_back();
                list.printList();
                System.out.println("\n");
            }
        } catch (VoidListException e){
            System.out.println(e.getMessage());
        } catch (DataNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
