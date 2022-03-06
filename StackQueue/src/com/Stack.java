package com;

public class Stack {
    static Node top;
    /**
     * push - method to enter a New element in a stack
     * Display my Node which is present in peak in Stack
     * pop an element from stack
     *
     * @param data - data to be added as parameter
     */
    public Node push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return top;
        }
        newNode.next = top;
        top = newNode;
        return top;
    }


    /**
     *  popping the top element from the stack
     *
     */
    public void pop () {
        System.out.println("Popped element is " + top.data);
        top = top.next;
    }

    /**
     *  peak - method to print top element of the stack
     *
     */
    public void peak() {
        if (top != null) {
            System.out.println("Top of the stack is " + top.data);
        } else {
            System.out.println("No element left in the stack.");
        }
    }

    /**
     *
     * print every current Node starting from top, while
     * changing to currentNode to nextNode when it prints one node.
     */
    public void printStack() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node pointer = top;
        while (pointer != null) {
            System.out.print(pointer.data + " ");

            pointer = pointer.next;
        }

    }
}
