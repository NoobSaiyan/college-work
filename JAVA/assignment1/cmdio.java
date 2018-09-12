import java.util.*;

class cmdio{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        n=args.length;
        int hm[] = new int[n];
        for(int i= 0;i<n;i++){
            hm[i]=Integer.parseInt(args[i]);
        }
        System.out.println("Entered array:-");
        for(int j=0;j<n;j++){
            System.out.print(hm[j]+" ");
        }
        System.out.println();
        System.out.println("Entered array in accending order:-");
        int temp;
        for(int k=0;k<n;k++){
            for(int l=0;l<n-1;l++){
                if(hm[l]>hm[l+1]){
                    temp=hm[l+1];
                    hm[l+1]=hm[l];
                    hm[l]=temp;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(hm[j]+" ");
        }
    }
}