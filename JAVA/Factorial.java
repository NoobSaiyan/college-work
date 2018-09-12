import java.util.*;
class Factorial{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        fact f=new fact();
        System.out.println("Factorial is "+f.cal(a));
    }    
}
class fact{
    int cal(int a){
        int p=1;
        for(int i=1;i<=a;i++){
            p=p*i;
        }
        return p;
    }
    
}