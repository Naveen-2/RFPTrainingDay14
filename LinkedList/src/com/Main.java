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
         * 4. Appending new nodes to end of linkedList
         * 5. Insert node in between two nodes
         * 6. Deleting first element of the list
         * 7. Deleting last element of the list
         * 8. Finding node with specific key
         * 9. Inserting new node next to specific key
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
        list.printLinkedList(head1);

        /*
         * 3. Adding nodes as head to the linkedList as in UC2
         */
        Node head2 = list.addNodeAsHead(null, 70);
        head2 = list.addNodeAsHead(head2, 30);
        head2 = list.addNodeAsHead(head2, 56);
        list.printLinkedList(head2);

        /*
         * 4. Appending new nodes to end of linkedList as in UC3
         */
        Node head3 = list.appendNode(null, 56);
        list.appendNode(head3, 30);
        list.appendNode(head3, 70);
        list.printLinkedList(head3);

        /*
         * 5. Insert new node between two nodes that are already in the list
         */
        Node head4 = list.addNode(null, 56);
        list.addNode(head4, 70);
        list.insertAt(head4, 30, 2);
        list.printLinkedList(head4);

        /*
         * 6. Delete first element of the list as in UC5
         */
        Node head5 = list.addNode(null, 56);
        list.addNode(head5, 30);
        list.addNode(head5, 70);
        list.printLinkedList(head5);
        head5 = list.pop(head5);
        list.printLinkedList(head5);

        /*
         * 7. Delete last element of the list as in UC6
         */
        Node head6 = list.addNode(null, 56);
        list.addNode(head6, 30);
        list.addNode(head6, 70);
        list.printLinkedList(head6);
        list.popLast(head6);
        list.printLinkedList(head6);

        /*
         * Find a specific key if available as in UC7
         */
        Node head7 = list.addNode(null, 56);
        list.addNode(head7, 30);
        list.addNode(head7, 70);
        list.printLinkedList(head7);
        list.findNodeInList(head7, 30);

        /*
         * Insert a new node next to specific key as in UC7
         */
        Node head8 = list.addNode(null, 56);
        list.addNode(head8, 30);
        list.addNode(head8, 70);
        list.printLinkedList(head8);
        int position = list.findNodeInList(head8, 30);
        list.insertAt(head8, 40, position +1);
        list.printLinkedList(head8);
    }
}
