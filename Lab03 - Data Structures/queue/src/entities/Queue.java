package entities;

public class Queue {
    private LinkedList list;

    public Queue(){
        list = new LinkedList();
    }

    public void push(int  num){
        list.push_back(num);
    }

    public void pop(){
        list.pop_front();
    }

    public int size(){
        return list.getSize();
    }
    public int front(){
        return list.front();
    }
    public void print(){
        list.printList();
    }

}
