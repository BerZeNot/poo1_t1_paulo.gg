package entities;

import entities.Node;

public class LinkedList{
    private Node head = null;
    private int size = 0;

    public int find_pos(int pos){
        if (head == null){
            throw new Error("Lista vazia");
        }

        Node curr = this.head;

        int count = 1;
        while(curr != null && count < pos){

            curr = curr.getNext();

        }

        if(curr == null){
            throw new Error("Dado nao encontrado");
        }

        return curr.getValue();
    }

    public int find_data(int num){
        if (head == null){
            throw new Error("Lista vaziia");
        }

        Node curr = this.head;

        while(curr != null && curr.getValue() != num){

            curr = curr.getNext();

        }

        if(curr == null){
            throw new Error("Dado nao encontrado");
        }

        return curr.getValue();
    }

    public int back(){
        if (head == null){
            throw new Error("Lista vaziia");
        }

        Node curr = this.head;

        while(curr.getNext() != null){

            curr = curr.getNext();

        }

        return curr.getValue();
    }

    public int front(){
        if (head == null){
            throw new Error("Lista vaziia");
        }

        return head.getValue();
    }

    public void erase_position(int pos){
        if (head == null){
            throw new Error("Lista vaziia");
        }

        if(pos > size + 1){
            throw new Error("Posicao maior que o numero de elementos");
        }

        Node prev = null;
        Node curr = this.head;

        int count = 1;

        while((curr != null) && count < pos){
            prev = curr;

            curr = curr.getNext();

            ++count;
        }

        if(prev == null){
            throw new Error("Lista vaziia");
        }else{
            prev.setNext(curr.getNext());
        }

        --this.size;
    }

    public void erase_data(int num){
        if (head == null){
            throw new Error("Lista vaziia");
        }


        Node curr = this.head;
        Node prev = null;

        while ((curr != null) && curr.getValue() != num){
            prev = curr;
            curr = curr.getNext();
        }

        if(prev == null){
            throw new Error("Nao encontrado");
        }else{
            prev.setNext(curr.getNext());
        }

        --this.size;
    }

    public void pop_front(){
        if (head == null){
            throw new Error("Lista vaziia");
        }

        this.head = this.head.getNext();

        --this.size;
    }

    public void pop_back(){
        if (head == null){
            throw new Error("Lista vaziia");
        }

        Node curr = this.head;
        Node prev = null;

        while(curr.getNext() != null){
            prev = curr;
            curr = curr.getNext();
        }

        if(prev == null){
            throw new Error("Lista vaziia");
        }else{
            prev.setNext(null);
        }

        --this.size;

    }


    public void insert_sorted(int num){

        Node node = new Node(num, null);

        Node curr = this.head;
        Node prev = null;

        while ((curr != null) && curr.getValue() < num){
            prev = curr;
            curr = curr.getNext();
        }

        if(prev == null){
            node.setNext(this.head);
            this.head = node;
        }else{
            prev.setNext(node);
            node.setNext(curr);
        }

        ++this.size;

    }

    public void insert(int num, int pos){
        if(pos > size + 1){
            throw new Error("Posicao maior que o numero de elementos");
        }

        Node node = new Node(num, null);

        Node prev = null;
        Node curr = this.head;

        int count = 1;

        while((curr != null) && count < pos){
            prev = curr;

            curr = curr.getNext();

            ++count;
        }

        if(prev == null){
            node.setNext(this.head);
            this.head = node;
        }else{
            prev.setNext(node);
            node.setNext(curr);
        }

        ++this.size;
    }

    public void push_front(int num){
        Node node = new Node(num, null);

        if(this.head == null){
            this.head = node;
        }else{
            node.setNext(this.head);
            head = node;
        }

        this.size++;

    }

    public void push_back(int num){
        Node node = new Node(num, null);

        if(this.head == null){
            this.head = node;
        }else{
            Node aux = this.head;

            while(true){
                if(aux.getNext() == null){
                    aux.setNext(node);
                    break;
                }

                aux = aux.getNext();
            }

        }

        this.size++;
    }

    public void printList(){

        if(head == null){
            throw new Error("Lista vazia");
        }

        Node aux = head;

        while(true){

            if(aux.getNext() == null){
                System.out.println(aux.getValue());
                break;
            }

            System.out.println(aux.getValue());

            aux = aux.getNext();


        }

    }

    public int getSize() {
        return size;
    }
}