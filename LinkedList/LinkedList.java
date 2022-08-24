package LinkedList;

public class LinkedList {

    private Node head;
    private int size;
    public void addElementFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addElementLast(int data){
        Node newNode = new Node(data);
 
        if(head == null) {
            head = newNode;
            return;
        }
  
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
  
        lastNode.next = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public int length(){
        return size;
    }

    public void deletedFirstNode(){

        if(head == null){
            System.out.println("List is empty.");
            return;
        }else{
            head = head.next;
            size--;
        }
    }

    public void deleteLastNode(){
        //0 nodes are there
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
  
        size--;
        // 1 node is there
        if(head.next == null) {
            head = null;
            return;
        }
  
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
  
        currNode.next = null;
 
    }
}
