import java.util.*;

class Variadic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0,a=0,n=0;
        String name;
        System.out.println("Enter the no of students entering the match");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            count++;
            System.out.printf("Enter the name of student %d \n",count);
            name=sc.next();
            System.out.println("Enter the number of round played out of 10");
            a=sc.nextInt();
            System.out.printf("Enter the scores of the %s \n",name);
            int brah[]=new int[10];
            for(int j=0;j<a;j++){
                brah[j]=sc.nextInt();
            }
            fun(name,brah);   
        }

    }

static void fun(String str,int ...a){
        System.out.printf("\n\n");
        System.out.println("Name: " + str);
        System.out.println("Number of rounds: "+ a.length);
        for (int i: a)
            System.out.print(i + " ");
 
        System.out.printf("\n\n");
    }
}
