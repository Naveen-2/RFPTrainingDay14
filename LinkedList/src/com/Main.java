package com;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = list.append(null, 56);
        list.append(head, 30);
        list.append(head, 70);
        list.printLinkedList(head);
    }
}
