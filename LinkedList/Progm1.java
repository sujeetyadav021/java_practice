package LinkedList;

import java.util.ArrayList;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
       // this.next=next;

    }
}

class SingleLinkedList{

    Node head;
// Addtion Operations
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
    //print of LL
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
// Update Operations
    void updateAtPos(int pos,int value){
        Node curr = head;
        int currPos = 1;
        while(currPos<pos){
            curr = curr.next;
            currPos++;
        }
        curr.data=value; 

    }

    void updateBYValue(int oldValue, int newValue){
        Node curr =head;
        while(curr != null){
            if(curr.data == oldValue){
                curr.data=newValue;
                break;
            }
            curr=curr.next;
        }
    }
    // Deletion Operations 1. delete Head 2.delete last Node 3.Delete at position

    void deleteHead(){
        if(head !=null)
        head = this.head.next;
    }

    void deleteLastNode(){
        Node curr = head;
        if(head.next==null){
            this.head=null;
        }
        while ((curr.next.next != null)) {
            curr=curr.next;
        }
        curr.next = null;
    }

    void deleteAtPos(int pos){
        if (pos==1){
             deleteHead();
             return;
        }
        Node curr = head;
        int currPos = 1;
        while (currPos < pos-1) {
            curr = curr.next;
            currPos++;
            }
            curr.next= curr.next.next;
    }
}

class DoublyLinkList{
    Node head;
    // Addtion Operations
    void addToFront(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next=this.head;
        head.prev=newNode;
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
        newNode.prev=curr;
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
            child.prev=newNode;
            newNode.prev=curr;
        }
        
    }

    // Update Operations
    void updateAtPos(int pos,int value){
        Node curr = head;
        int currPos = 1;
        while(currPos<pos){
            curr = curr.next;
            currPos++;
        }
        curr.data=value; 

    }

    void updateBYValue(int oldValue, int newValue){
        Node curr =head;
        while(curr != null){
            if(curr.data == oldValue){
                curr.data=newValue;
                break;
            }
            curr=curr.next;
        }
    }
    // Deletion Operations 1. delete Head 2.delete last Node 3.Delete at position

    void deleteHead(){
        if(head !=null)
        head = this.head.next;
        head.prev=null;
    }

    void deleteLastNode(){
        Node curr = head;
        if(head.next==null){
            this.head=null;
        }
        while ((curr.next.next != null)) {
            curr=curr.next;
        }
        curr.next = null;
    }

    void deleteAtPos(int pos){
        if (pos==1){
             deleteHead();
             return;
        }
        Node curr = head;
        int currPos = 1;
        while (currPos < pos-1) {
            curr = curr.next;
            currPos++;
            }
            curr.next= curr.next.next;
            if(curr.next !=null){
                curr.next.prev=curr;
            }
    }
    //print of DLL
    void printList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class Progm1 {
    public static void main(String[] args) {
        SingleLinkedList l1 = new SingleLinkedList();
        DoublyLinkList dll = new DoublyLinkList();
        l1.addToFront(2);
       // l1.printList();
        l1.addToFront(40);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToFront(2);
        l1.addToLast(50);
        l1.addToLast(23);
        //l1.printList();
        l1.addAtPos(3, 90);
        l1.printList();
        // System.out.println(l1.getLengthLL());
        // System.out.println(l1.valueOFMiddleNode());
        // l1.updateAtPos(1, 900);
        // l1.printList();
        // l1.updateBYValue(900,500);
        // l1.printList();
        // l1.deleteHead();
        // l1.printList();
        //l1.deleteLastNode();
        l1.deleteAtPos(3);
        l1.printList();
        dll.addToFront(20);
        dll.addToFront(42);
        dll.addToFront(52);
        dll.addToFront(62);
        dll.addToFront(72);
        dll.addToLast(580);
        dll.addToLast(233);
        dll.printList();
        dll.addAtPos(3, 90);
        dll.printList();
        //  System.out.println( dll.getLengthLL());
        //  System.out.println( dll.valueOFMiddleNode());
        dll.updateAtPos(1, 900);
        dll.printList();
        dll.updateBYValue(900,500);
        dll.printList();
        dll.deleteHead();
        dll.printList();
        dll.deleteLastNode();
        dll.deleteAtPos(3);
        dll.printList();
    }
}
