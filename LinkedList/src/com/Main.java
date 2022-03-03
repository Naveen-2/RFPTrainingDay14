package com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        Node head = list.addNode(null, 56);
        list.addNode(head, 30);
        list.addNode(head, 70);
    }
}
