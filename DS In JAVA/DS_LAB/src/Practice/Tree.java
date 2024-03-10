package Practice;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    class Node{
        int data;
        Node lchild;
        Node rchild;

        Node(int data){
            this.data=data;
            this.lchild=null;
            this.rchild=null;
        }
    }

    public Node root;

    public void createBT(){
        System.out.println("Enter the root value");
        Scanner sc=new Scanner(System.in);
        int d= sc.nextInt();
        Node nn=new Node(d);
        root=nn;
        Queue<Node> queue=new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int da=queue.peek().data;
            System.out.println("Enter the left child of "+da);
            d= sc.nextInt();
            Node a=new Node(d);
            Node temp=queue.remove();
            if(d!=-1){
                temp.lchild=a;
                queue.add(a);
            }

            System.out.println("Enter right child of "+da);
            d= sc.nextInt();
            Node b=new Node(d);
            if(d!=-1){
                temp.rchild=b;
                queue.add(b);
            }
        }
    }

    public void inOrder(Node temp){
        if(temp!=null){
            inOrder(temp.lchild);
            System.out.println(temp.data+" ");
            inOrder(temp.rchild);
        }
    }

    public void postOrder(Node temp){
        if(temp!=null){
            postOrder(temp.lchild);
            System.out.println(temp.data+" ");
            postOrder(temp.rchild);
        }
    }

    public void preOrder(Node temp){
        if(temp!=null){
            preOrder(temp.lchild);
            System.out.println(temp.data+" ");
            preOrder(temp.rchild);
        }
    }
}
