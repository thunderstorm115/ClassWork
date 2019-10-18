/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks_example;

/**
 *
 * @author dennis liebenberg Student Number: QFJDGRL93
 *
 */
public   class Stacks_Example {

    public static  class Mystack {

        int top;
        int[] a;

        public Mystack() {
            top = -1;
            a = new int[10];

        }//constructr for Class MyStack

        void push(int item) {
            top++; //increase value of items inside the stack
            a[top] = item; //place item in to the stack
        }//push item on to stack

        boolean isEmpty() {
            if (top == -1) {
                return true;
            } else {
                return false;
            }
        } //check if the stack is empty

        int pop() {
            int returnValue = a[top];
            top = top - 1;
            return returnValue;
        }//returns top item of the stack and decreases amount of items in stack.

        boolean isFull() {
            if (top == a.length) {
                return true;
            } else {
                return false;
            }
        }//check if the stack is full or not.

        int peek() {
            return a[top];
        }

    }//end of Mystack Class

    public static void main(String[] args) {
      Mystack aStack = new Mystack();
        for (int i = 0; i < 5; i++) {
           aStack.push(i); 
        }
        while(aStack.isEmpty()!=true){
            System.out.println(aStack.pop()+"");
        }
      
      
    }

}
