package com;

public class Queue {
    static Node head;

    /**
     * enqueue - this method is created to append data to linkedList
     *
     * @param data - accepting data to create new node and add it in linkedList
     *
     */
    public void enqueue(int data) {
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
    }

    /**
     * dequeue - this method is used to delete first node(head) in the list and replace it with second element if present
     *
     */
    public void dequeue() {
        System.out.println("Dequeued element is " + head.data);
        /*
        head node is directly changed to it's head.next
         */
        head = head.next;
    }

    /**
     * printQueue - this method is used to print nodes from head
     *
     */
    public void printQueue(){
        /*
         * If head position is null, then list will be empty.
         * Else, a pointer will be created and every node will be printed one after another.
         */
        if (head == null) {
            System.out.println("Queue is empty.\n");
        } else {
            Node pointer = head;
            while (pointer != null) {
                System.out.print(pointer.data + " ");
                pointer = pointer.next;
            }
            System.out.println("\n");
        }
    }

}
