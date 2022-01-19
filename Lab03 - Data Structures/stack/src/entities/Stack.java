package entities;

public class Stack {

    private LinkedList list;

    public Stack(){
        list = new LinkedList();
    }

    public void push(int number){
        list.push_back(number);
    }

    public void pop(){
        list.pop_back();
    }

    public int top(){
        return list.back();
    }
    public int size(){
        return list.getSize();
    }

    public void print(){
        for(int i = list.getSize(); i > 0; i--){
            if(i==list.getSize())
                System.out.println("|_" + list.find_pos(i) + "_| <- Stack top");
            else
                System.out.println("|_" + list.find_pos(i) + "_|");
        }
    }
}
