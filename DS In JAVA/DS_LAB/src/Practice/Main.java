package Practice;

public class Main {
    public static void main(String[] args){
        Tree t1=new Tree();
        t1.createBT();
        t1.inOrder(t1.root);
    }
}
