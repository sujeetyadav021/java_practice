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
    
    void addToLast(int data){
        Node newNode = new Node(data);
        Node curr = head;
        if(this.head==null){
            this.head=newNode;
        }
        else{
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next=newNode;
    }
    }

    void addAtPos(int pos, int data){
        if(pos == 1){
            this.addToFront(data);
        }
        else{
            Node newNode = new Node(data);
            Node curr = head;
            int currPos=1;
            while(currPos<pos-1){
                curr=curr.next;
                currPos++;
            }
            Node child = curr.next;
            curr.next=newNode;
            newNode.next=child;
        }
        
    }
    void printList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    int getLengthLL(){
        int size =0;
        Node curr = head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }
    int valueOFMiddleNode(){
        int size=getLengthLL();
        int middlePos=(size+1)/2;
        Node curr = head;
        int currPos=1;
        while(currPos<middlePos){
            curr=curr.next;
            currPos++;
        }
        return curr.data;
    }
}
public class Progm1 {
    public static void main(String[] args) {
        SingleLinkedList l1 = new SingleLinkedList();
        l1.addToFront(2);
       // l1.printList();
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToLast(50);
        l1.addToLast(23);
        l1.printList();
        l1.addAtPos(3, 90);
        l1.printList();
        System.out.println(l1.getLengthLL());
        System.out.println(l1.valueOFMiddleNode());

    }
}
