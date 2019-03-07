import java.awt.*;

class test extends Frame{
    test(){
        Button b= new Button("Fuck yeah!!!");
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        b.setVisible(true);
        b.setSize(100,50);
        b.setBounds(30,20,30,50);
    }
    public static void main(String args[]){
        test t =new test();
    }
}