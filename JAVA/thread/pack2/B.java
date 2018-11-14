package pack2;
public class B extends Thread{
    public B(String Name){
        super(Name);
    }

    public void run(){
        System.out.println("Extended class started "+Thread.currentThread().getName());
        try{
            int n=2;
            for(int i=0;i<=n;i++){
                System.out.println("Count Extended:"+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println("Error!!");
        }
        System.out.println("Extended class ended "+Thread.currentThread().getName());
    }
}