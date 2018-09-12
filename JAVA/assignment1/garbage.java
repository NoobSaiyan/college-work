import java.util.*;

class garbage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        garbage s=new garbage(26);
        s=null;
        System.out.println("Enter 1 to see garbage collected and any other no to exit");
        int flag = sc.nextInt();
        if(flag==1){
            System.gc();
        }
        else{
            System.out.println("Bye :)");
        }
    }

    int n=0;

    garbage(int a){
        n=a;
    }

    protected void finalize(){
        System.out.println("GARBAGE !! "+this);
    }
}




