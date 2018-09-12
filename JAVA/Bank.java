import java.util.*;
import java.io.*;

class Bank{
    public static void main(String[] args){
    PrintStream ps = new PrintStream(System.out);
    Scanner sc = new Scanner(System.in);
    ps.println("Welcome to Awsome Bank :)");
    Logic l=new Logic();
    int AccIndex=0,Curr=-1,Balance=0,p=1,flag=-1,accnum=0,i=0;
    int list[]=new int[10];
    int login[]=new int[10];
    while(p!=0){
        ps.printf(" 1 Create Account \n 2 Login \n 3 Check Balance \n 4 Deposite \n 5 Withdraw \n 6 logout \n 7 Exit \n");
        ps.println("Enter the option to procced- ");
        
        int opt=sc.nextInt();

        switch(opt) {
            case 1:
                ps.println("Enter a accNumber- ");
                int code = sc.nextInt();
                list[AccIndex]=code;
                ps.printf("Account created!! with balance %d \n",Balance);
                AccIndex++;
                break;
            case 2:
                ps.println("Enter the accNumber- ");
                int id = sc.nextInt();
                int temp=0;
                    ps.println(i);
                    login[i]=list[AccIndex-1];
                    temp=login[i];
                    ps.println(temp);
                    i++;
                accnum=i;
                if(temp==id){
                    ps.println("Account has been logged in!!");
                    flag=1;
                }
                else{
                    ps.println("Account doesn't exist!!");
                    flag=0;
                }
                break;
            case 3:
                if(flag==1){
                    ps.println("Amount in balance "+l.view(accnum));
                    break;
                }
                else if(accnum==0){
                    ps.println("Login First :/");
                    break;
                }
            case 4:
                if(flag==1){
                    ps.println("Enter the amount to be added- ");
                    int am=sc.nextInt();
                    l.dep(accnum,am);
                    ps.println("Amount added to ur account- ");
                }
                else if(accnum==0){
                    ps.println("Login First :/");
                }
                break;
            case 5:
                if(flag==1){
                    ps.println("Enter the amount to be withdrawn- ");
                    int de=sc.nextInt();
                    l.wid(accnum,de);
                    ps.println("Amount withdrawn from the account- ");
               }
               else if(accnum==0){
                    ps.println("Login First :/");
               }
               break;
            case 6:
               if(flag==1){
                    accnum=0;
                    ps.println("User has been logged out ");
               }
               else if(accnum==0){
                   ps.println("First login ");
               }
               break;
            case 7:
               p=0;
               ps.println("Bye!!");
               break;
            default:
               ps.println("Enter valid option");
               break;
        }
    }
    ps.printf(" See You Soon :) \n Have a nice day");
    }
}
class Logic{
    int balance[]=new int[10];
    int wid(int accnum,int de){
        return balance[accnum]-=de;
    }
    int dep(int accnum,int am){
        int i=accnum;
        balance[i]+=am;
        return balance[i];
    }
    int view(int accnum){
        return balance[accnum];
    }
}