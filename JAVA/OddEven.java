import java.util.*;
class OddEven{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        check ch = new check();
        if(ch.checkin(a))
        {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
class check{
    int c;
    boolean checkin(int a){
        c=a%2;
        if(c==0){
            return true;
        }
        else{
            return false;
        }
    }
}