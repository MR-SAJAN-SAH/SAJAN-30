//Program to find no. of objects created out of a class using ‘static’ modifier.
package lab2;
class test{
    static int noOfObj=0;
    public test(){
        noOfObj++;
    }
}
public class a4 {
    public static void main(String[] args){
        test a=new test();
        test b=new test();
        test c=new test();
        System.out.println(test.noOfObj+" Object of test class created");
    }
}
