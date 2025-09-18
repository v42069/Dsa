package com.v.linked_list;


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class LinkedList {

    Node head;

    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void insertFirst(int data){
        Node firstNode=new Node(data);
        firstNode.next=head;
        head=firstNode;
    }

    void deleteByElement(int data){

        while(head.next!=null){
            if(head.data==data){
                Node next=head.next.next;
                head.next=next;
                return;
            }
            head=head.next;
        }
    }

    void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;    // 1. Remember next node
            current.next = prev;    // 2. Reverse pointer
            prev = current;         // 3. Move prev forward
            current = next;         // 4. Move current forward
        }
        head = prev; // New head is the last node processed
    }


    public static void main(String[] args) {
        LinkedList lk=new LinkedList();
        lk.insert(5);
        lk.insert(1);
        lk.insertFirst(10);
        lk.printLL();
//        lk.deleteByElement(1);
        lk.printLL();
        lk.reverse();
        lk.printLL();
    }
}
