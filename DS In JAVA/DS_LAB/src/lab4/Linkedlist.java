package lab4;

import java.util.Scanner;

public class Linkedlist {
    class Node{
        private int data ;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    public void create(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" elements to add in linkedlist...");
        for(int i=0;i<n;i++){
            int data= sc.nextInt();
            Node nn=new Node(data);
            if(head==null){
                head=nn;
            }else{
                Node temp=head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=nn;
            }
        }
    }

    public void display(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public Node head=null;

    public void insertB(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to add at beginning");
        int data= sc.nextInt();
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }else{
            nn.next=head;
            head=nn;
        }
    }

    public void insertL(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to add at last");
        int data= sc.nextInt();
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }

    public void insertS(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to add at last");
        int data= sc.nextInt();
        System.out.println("Enter the position");
        int s=sc.nextInt();
        if(s<1){
            System.out.println("Invalid position!");
            return;
        }
        Node nn=new Node(data);
        if(head==null || s==1){
            nn.next=head;
            head=nn;
        }else{
            Node temp=head;

            for(int i=1;i<s-1;i++){
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
        }
    }

    public void deleteB(){
        if(head==null){
            System.out.println("Linkedlist is empty already:!");
        }
        else{
            head=head.next;
        }
    }

    public void deleteL(){
        if(head==null){
            System.out.println("Linkedlist is empty already:!");
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    public void deleteS(){
        if(head==null){
            System.out.println("Linkedlist is empty already:!");
        }else{
            Node temp=head;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the position to delete");
            int s= sc.nextInt();
            for(int i=1;i<s-1;i++){
                temp=temp.next;
            }
            Node a=temp.next.next;
            temp.next=a;
        }

    }

    public void totalNodes(){

    }

    public void search(){

    }
}
