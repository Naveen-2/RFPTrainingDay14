package com;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        /*
          pushing new Elements to the Stack
         */
        Node top1 = stack.push(null, 70);
        top1 = stack.push(top1,30);
        top1 = stack.push(top1,56);

        stack.printStack(top1);

    }
}