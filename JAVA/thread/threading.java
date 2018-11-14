import pack.A;
import pack2.B;

public class threading{
    public static void main(String args[]){
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new A());
        System.out.println("Calling Implemented thread ");
        t1.start();
        t2.start();

        B b1 = new B("Thread-0");
        B b2 = new B("Thread-1");
        System.out.println("Calling Extended thread ");
        b1.start();
        b2.start();
    }
}