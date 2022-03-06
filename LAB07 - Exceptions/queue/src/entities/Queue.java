package entities;

import exceptions.VoidListException;

public class Queue {
    private LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void push(int num) {
        list.push_back(num);
    }

    public void pop() throws VoidListException {
        list.pop_front();
    }

    public int size() {
        return list.getSize();
    }

    public int front() throws VoidListException {
        return list.front();
    }

    public void print() throws VoidListException {
        list.printList();
    }

}
