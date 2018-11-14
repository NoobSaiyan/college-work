package pack;

public class A implements Runnable{
    public void run(){
        System.out.println("Implemented class started "+Thread.currentThread().getName());
        try{
            int n=2;
            for(int i=0;i<=n;i++){
                System.out.println("Count Implimented:"+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Error!!");
        }
        System.out.println("Implemented class ended "+Thread.currentThread().getName());
    }
}