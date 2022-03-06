package com;

public class Main {
    public static void main(String[] args) {

        Stack stack1 = new Stack();

        /*
          pushing new Elements to the Stack
         */
        stack1.push( 70);
        stack1.push(30);
        stack1.push(56);

        stack1.printStack();

        stack1.peak();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        /*
        All nodes popped until stack is empty.
         */
        stack1.printStack();

        /*
        New Queue is created and operations are performed
         */
        Queue queue1 = new Queue();
        queue1.enqueue(56);
        queue1.enqueue(30);
        queue1.enqueue(70);

        queue1.printQueue();

        queue1.dequeue();
        queue1.dequeue();
        queue1.dequeue();

        queue1.printQueue();

    }
}