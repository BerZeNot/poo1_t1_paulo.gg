package application;

import entities.Queue;

public class QueueTester {

    public static void main(String[] args) {
        Queue q = new Queue();

        for(int i=1; i<=10; i++){
            q.push(i);
        }

        q.print();

        System.out.println("Queue front: " + q.front());
        System.out.println("Queue size: " + q.size());
        System.out.println("Will pop three elements...");
        q.pop();
        q.pop();
        q.pop();
        q.print();
    }
}
