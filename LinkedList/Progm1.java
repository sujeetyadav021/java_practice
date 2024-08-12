package LinkedList;

import java.util.ArrayList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=next;

    }
}

class SingleLinkedList{

    Node head;

    void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next=this.head;
        this.head = newNode;


    }

    void printList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    void addToLast(){

    }

    void addAtPos(){

    }
}
public class Progm1 {
    public static void main(String[] args) {
        SingleLinkedList l1 = new SingleLinkedList();
        l1.addToFront(5);
        l1.printList();
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.printList();

    }
}
