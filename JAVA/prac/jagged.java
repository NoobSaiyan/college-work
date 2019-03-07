import java.lang.*;
import java.io.*;

public class jagged{
    public static void main(String args[]){
        int[][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[2];

        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]= count++;
            }
        }
        for(int l=0;l<a.length;l++){
            for(int m=0;m<a[l].length;m++){
                System.out.print(a[l][m]+" ");
            }
            System.out.println("");
        }
    }
}