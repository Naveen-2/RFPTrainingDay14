package com;

public class Main {
    /**
     * Main method for manipulation linkedList
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        /*
         * PROCEDURE
         * 1. Creating a linkedList
         * 2. Adding nodes to linkedList
         * 3. Adding nodes to linkedList in head
         */

        /*
         * 1. Creating a linkedList
         */
        LinkedList list = new LinkedList();

        /*
         * 2. Adding nodes to linkedList as in UC1
         */
        Node head1 = list.addNode(null, 56);
        list.addNode(head1, 30);
        list.addNode(head1, 70);

        /*
         * 3. Adding nodes as head to the linkedList as in UC2
         */
        Node head2 = list.addNodeAsHead(null, 70);
        head2 = list.addNodeAsHead(head2, 30);
        head2 = list.addNodeAsHead(head2, 56);
    }
}
