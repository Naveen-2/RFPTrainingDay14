package com;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = list.addNodeAsHead(null, 70);
        head = list.addNodeAsHead(head, 30);
        head = list.addNodeAsHead(head, 56);
    }
}
