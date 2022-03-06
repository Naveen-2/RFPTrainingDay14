package com;

public class Stack {

    /**
     * push - method to enter a New element in a stack
     * Display my Node which is present in peak in Stack
     * pop an element from stack
     *
     * @param data - data to be added as parameter
     */
    public Node push(Node top, int data) {
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
     *
     * print every current Node starting from top, while
     * changing to currentNode to nextNode when it prints one node.
     */
    public void printStack(Node top) {
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
