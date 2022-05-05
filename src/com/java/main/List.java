package com.java.main;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.*;
/*public class List {
    public static void main(String[] args){
        LinkedList<String> Linked = new LinkedList(Arrays.asList(10,20,30,40,50));
        System.out.println("first LinkedList : " + Linked);

        LinkedList sisters = new LinkedList();
        sisters.add("Trupti");
        sisters.add("Shruti");
        sisters.add("Swati");
        sisters.add("Chaitali");
        sisters.add("Sujata");
        System.out.println("second LinkedList is: " + sisters);

        }
    }*/
//Traverse/print Linked List in java
//using for loop
/*class List{
    public static void main(String[] args){
        LinkedList colors = new LinkedList();
        colors.add("red");
        colors.add("yellow");
        colors.add("green");

        System.out.println("LinkedList elemetns using for loop: ");
        for(int i=0; i < colors.size(); i++){
            System.out.print(colors.get(i) + " ");
        }
    }
}*/
//Traverse linkedlist using iterator
/*public class List{
    public static void main(String[] args){
        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(8);
        linked.add(99);
        linked.add(43);
        linked.add(42);
        linked.add(10);

        iterateUsingIterator(linked);
    }
    public static void iterateUsingIterator(LinkedList<Integer> linked){
        System.out.println("Traversing LinkedList using Iterator: ");
        Iterator it = linked.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
}*/
//Reverse Linked List
/*public class List{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("pune");
        list.add("mumbai");
        list.add("nanded");
        System.out.println("Linked List : " + list);
        System.out.println("Linked List in reverse order : ");
        Iterator iter = list.descendingIterator();
        while(iter.hasNext()){
            System.out.println(iter.next() + " ");
        }
    }
}*/
//sort a linked list using comparator
/*public class List{
    public static void main(String[] args){
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("jan");
        l1.add("feb");
        l1.add("mar");
        l1.add("apr");
        l1.add("may");
        l1.add("jun");
        System.out.println("LinkedList Without Sorting : " + l1);
        Collections.sort(l1);
        System.out.println("LinkedList sorted in natural order : " + l1);
        Collections.sort(l1);
    }
}*/
//remove duplicates from LinkedList
/*public class List{
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Initially the head and tail of the linked list set to null
    public Node head = null;
    public Node tail = null;
    //add a new node to the linkedlist
    public void addNode(int data) {
        //Create new node
        Node newNode = new Node(data);

        //If list is empty set head and tail to new node
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            // add newNode after the tail
            tail.next = newNode;
            //newNode is now the tail or last element
            tail = newNode;
        }
    }

    //scans the linkedlist and removes duplicate nodes
    public void removeDuplicateNodes() {
        //Head is the current node
        Node current = head, index = null, temp = null;
        //head = null means list is empty
        if(head == null) {
            return;
        }
        //traverse through the list
        else {
            while(current != null){
                //temp node points to previous node to index.
                temp = current;
                //Index will point to node next to current
                index = current.next;
                while(index != null) {
                    //Check if current node's data is equal to index node's data
                    if(current.data == index.data) {
                        //since node is duplicate skip index and point to next node
                        temp.next = index.next;
                    }
                    else {
                        //Temp will point to previous node of index.
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    //print the linked list
    public void print() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Print each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
class sub {
    public static void main(String[] args) {
        LinkedList_Duplicate l_List = new LinkedList_Duplicate();

        //Add data to the list
        l_List.addNode(1);
        l_List.addNode(1);
        l_List.addNode(2);
        l_List.addNode(3);
        l_List.addNode(5);
        l_List.addNode(2);
        l_List.addNode(1);
        l_List.addNode(1);
        //print the original list
        System.out.println("Original Linkedlist: ");
        l_List.print();

        //Removes duplicate nodes
        l_List.removeDuplicateNodes();
        //print the altered list without duplicates
        System.out.println("LinkedList after removing duplicates: ");
        l_List.print();
    }
}*/
//ava 8 stream to display LinkedList
/*public class List{
    public static void main(String[] args){
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("grey");
        System.out.println("the contents of LinkedList: ");
        colors.stream().forEach(System.out::println);
    }
}*/
