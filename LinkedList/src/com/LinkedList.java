package com;

public class LinkedList {
    public Node addNode(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node pointer = head;

            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = newNode;
        }

        return head;
    }

    public Node addNodeAsHead(Node head, int data ){
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        return head;
    }

}
