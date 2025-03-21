package kk_repo.designpattern.DataStructure.linkedlist;

public class LinkedList {
    Node head;
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head==null) { //if object is your first object
            head = node; //then first node itself is head.
        } else {        //else if its not first node, what if there are already nodes present
            Node n = head;
            while (n.next!=null) { //to check if this node is not null then
                n = n.next;      //jump to next node
            }
            n.next = node;
        }
    }
    public void show() {
        Node node = head;
        while (node.next !=null) {  //traverse to all node
            System.out.println(node.data);  //and print
            node = node.next;
        }
        System.out.println(node.data); // to print the last node
    }
}
