import java.util.*;
class fibo{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        fabs f= new fabs();
        f.fabzo(a);
    }
}
class fabs{
    void fabzo(int a){
        int t1=0,t2=1;
        for(int i=0;i<a;++i){
            System.out.println(t1 + "");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}