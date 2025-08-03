import org.w3c.dom.Node;

import java.util.*;
public class LL {
    node head;
    class node {
        String data;
        node next;

        node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add first
    public void addfirst(String data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    // add last
    public void addLast(String data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }

    // print function
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printList();

        list.addLast("list");
        list.printList();
        list.addfirst( "this");
        list.printList();

    }
}