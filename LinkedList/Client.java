package LinkedList;

import java.util.Scanner;

public class Client {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
     

        
        list.addElementFirst(12);
        list.addElementFirst(212);
        list.display();;
        System.out.println(list.length());

        list.addElementLast(300);
        list.display();
        System.out.println(list.length());
        // int size = list.length();
        // System.out.println(size);

        list.deletedFirstNode();
        list.display();
        System.out.println(list.length());

        list.deleteLastNode();
        list.display();
         int size = list.length();
        System.out.println(size);
        scanner.close();
    }
}
