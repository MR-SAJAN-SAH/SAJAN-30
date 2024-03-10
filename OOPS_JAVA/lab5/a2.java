/*-Define an interface Motor with a data member –capacity and two methods such as run() and consume().
Define a Java class ‘Washing machine’ which implements this interface and write the code to check the value
of the interface data member through an object of the class.*/

package lab5;

interface Motor{
    int capacity=500;
    void run();
    void consume();


}

class Washing_Machine implements Motor{
    @Override  
    public void run(){
        System.out.println("You ran 200 min.");
    }
    @Override
    public void consume(){
        System.out.println("You used 200 min out of your capacity of "+Motor.capacity);
    }

}
public class a2 {
   public static void main(String[] args){
       Washing_Machine w=new Washing_Machine();
       w.run();
       w.consume();
   }
}
