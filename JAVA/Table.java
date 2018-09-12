import java.io.*;
import java.util.*;

class Table{
    public static void main(String[] args){
        int a=0;
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);
        ps.println("Enter the number to print table -> ");
        a=sc.nextInt();
        mul m = new mul();
        m.fun(a);
    }
}
class mul{
    void fun(int a){
        int num=a;
        for(int i=0;i<=10;i++){
            System.out.printf(num +" X "+ i + " = "+num*i+"\n" );
        }
    }
}