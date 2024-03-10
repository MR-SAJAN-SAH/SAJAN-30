package lab4;
 /*Write a menu driven program to perform the following operations in a single linked list (using self-referencing structure) by using suitable user defined functions for each case.
         a.Create a list (Node Creation)
         b.Display the list
         c.Insert a node (at beginning/ at end / at any position)
         d.Delete a node (at beginning/ at end / at any position)
         e.Count the total number of nodes
         f.Search for an element in the linked list */


import java.util.Scanner;

public class a1 {
    public static void main(String[] args){
        Linkedlist l1=new Linkedlist();
        l1.create();
        //l1.insertB();
        //l1.insertL();
        l1.insertS();
        l1.display();

    }
}
