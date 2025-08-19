package Stacks;

public class Stack {
    int[] arr;
    int top;
    int size;
    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Overflow");
            return;
        }
        arr[++top]=data;
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        top--;
    }
    int Top(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}