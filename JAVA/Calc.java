import java.util.*;
import java.io.*;
class add{
    int addin(int a,int b){
        return a+b;
    }
}
class Calc{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        PrintStream pc= new PrintStream(System.out);
        a=sc.nextInt();
        b= sc.nextInt();
        add r=new add();
        pc.println("Result"+r.addin(a,b));
    }
}