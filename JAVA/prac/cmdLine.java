import java.lang.*;
import java.io.*;

class cmdLine{
    public static void main(String args[]){
        int n = args.length;
        int i=0,flag=0,tem=0;
        int[] temp=new int[n];
        for(int x=0;x<n;x++){
            temp[x]=Integer.parseInt(args[x]);
        } 
        for(flag=0;flag<n-1;flag++){
            for(i=0;i<n-1;i++){
                if(temp[i] > temp[i+1]){
                    tem =temp[i+1];
                    temp[i+1] = temp[i];
                    temp[i]=tem;
                }
            }           
        }
        
        for(int p=0;p<n;p++){
            System.out.println(temp[p]);
        }
    }
}