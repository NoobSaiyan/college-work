abstract class A{
    abstract void f1();

    void f2(){
        System.out.println("This is second function from abstract class and extended to class B");
    }
}



class B extends A{
    void f1(){
        System.out.println("This is overried function of abstract class B");
    }

    void f2(){
        System.out.println("Trying overriding");
    }
}



public class Abstract{
    public static void main(String args[]){
        B b = new B();
        b.f1();
        b.f2();
    }
}

