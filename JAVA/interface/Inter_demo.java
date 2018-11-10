interface inter1{
    final int b = 20;
    void display();
}

public class Inter_demo implements inter1{
    
    public void display(){
        System.out.println("Result from interface = "+b);
    }
    public static void main(String args[]){
        Inter_demo id = new Inter_demo();
        id.display();

    }
}