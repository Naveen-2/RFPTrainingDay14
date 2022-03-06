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
         */

        /*
         * 1. Creating a linkedList
         */
        LinkedList list = new LinkedList();

        /*
         * 2. Adding nodes to linkedList as in UC1
         */
        Node head = list.addNode(null, 56);
        list.addNode(head, 30);
        list.addNode(head, 70);
    }
}
