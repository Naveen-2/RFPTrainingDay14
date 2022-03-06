package com;

public class LinkedList {

    /**
     * addNode - this method is created to add data to linkedList
     *
     * @param head - accepting head pointer of LinkedList to manipulate it
     * @param data - accepting data to create new node and add it in linkedList
     * @return head - it returns head of linkedList
     *
     */
    public Node addNode(Node head, int data) {
        /*
         * New node is created with the parameter data
         */
        Node newNode = new Node(data);

        /*
         * If the param head is null, new node will be head
         * else a separate pointer is created with head
         * and pointer will be moved to last node in the list with while loop
         * after reaching last node, it's next will be assigned to new node that was created earlier
         */
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

    /**
     * addNodeAsHead - Node will be added to head instead of tail
     * @param head - accepting head pointer of LinkedList to manipulate it
     * @param data - accepting data to create new node and add it in linkedList
     * @return head - it returns head of linkedList
     */
    public Node addNodeAsHead(Node head, int data ){
        /*
         * New node is created with the parameter data
         */
        Node newNode = new Node(data);
        /*
         * If the list already have a head, new node's next will point to head.
         * And head of the linkedList will be changed to new node.
         */
        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
        return head;
    }

    /**
     * appendNode - this method is created to append data to linkedList
     *
     * @param head - accepting head pointer of LinkedList to manipulate it
     * @param data - accepting data to create new node and add it in linkedList
     * @return head - it returns head of linkedList
     *
     */
    public Node appendNode(Node head, int data) {
        /*
         * New node is created with the parameter data
         */
        Node newNode = new Node(data);

        /*
         * If the param head is null, new node will be head
         * else a separate pointer is created with head
         * and pointer will be moved to last node in the list with while loop
         * after reaching last node, it's next will be assigned to new node that was created earlier
         */
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
    /**
     * insertAt - this method is used to insert new node after the mentioned position in linkedList
     *
     * @param head - accepting head pointer of LinkedList to manipulate it
     * @param position - accepting position to create new node and insert next to the position in linkedList
     *
     */
    public void insertAt(Node head, int data, int position){
        /*
         * New node is created with the parameter data
         */
        Node newNode = new Node(data);

        Node pointer = head;
        int counter = 1;
        while (counter < position-1) {
            pointer = pointer.next;
            counter++;
        }
        newNode.next = pointer.next;
        pointer.next = newNode;

    }

    /**
     * printLinkedList - this method is used to print nodes from head
     *
     * @param head - accepting head pointer of LinkedList to print it
     *
     */
    public void printLinkedList(Node head){
        /*
         * If head position is null, then list will be empty.
         * Else, a pointer will be created and every node will be printed one after another.
         */
        if (head == null) {
            System.out.println("LinkedList is empty.\n");
        } else {
            Node pointer = head;
            while (pointer != null) {
                System.out.print(pointer.data + " ");
                pointer = pointer.next;
            }
            System.out.println("\n");
        }
    }

    /**
     * pop - this method is used to delete first node(head) in the list and replace it with second element if present
     *
     * @param head - accepting head pointer of LinkedList to print it
     */
    public Node pop(Node head) {
        System.out.println("Deleted node from start : " + head.data);
        /*
        head node is directly changed to it's head.next
         */
        head = head.next;
        return head;
    }

    /**
     * pop - this method is used to delete last node(head) in the list
     *
     * @param head - accepting head pointer of LinkedList to print it
     */
    public void popLast(Node head) {
        Node pointer = head;
        Node prev = null;
        /*
         * pointer will be moved to second last node in the list
         * And then it's next will be changed to null to remove last node from the list.
         */
        while (pointer.next != null) {
            prev = pointer;
            pointer = pointer.next;
        }
        System.out.println("Deleted node from end : " + pointer.data);
        assert prev != null;
        prev.next = null;
    }

    public void findNodeInList(Node head, int key){
        Node pointer = head;
        int counter = 1;
        boolean keyFound = false;

        while (pointer.next != null) {
            if(pointer.data == key){
                keyFound = true;
                break;
            }
            pointer = pointer.next;
            counter++;
        }
        if(pointer.data == key)
            keyFound = true;

        if(keyFound){
            System.out.println("Node with key " + key + " is found in the list at position "+counter+".");
        } else {
            System.out.println("The entered key is not present in the list.");
        }

    }

}
