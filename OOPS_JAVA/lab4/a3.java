/* Write a program in Java having three classes Apple, Banana
and Cherry. Class Banana and Cherry are inherited from class Apple and each class
have their own member function show() . Using Dynamic Method Dispatch concept
display all the show() method of each class.*/

package lab4;

class Apple{
    void show(){
        System.out.println("Apple is here");
    }
}

class Banana extends Apple{
    void show(){
        System.out.println("Banana is here");
    }
}

class Cherry extends Banana {
    void show(){
        System.out.println("Cherry is here");
    }
}


public class a3 {
    public static void main(String[] args) {
        Apple a=new Apple();
        a.show();
        Apple b=new Banana();
        b.show();
        Apple c=new Cherry();
        c.show();
    }
}
