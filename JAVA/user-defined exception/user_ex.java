class MyExcep extends Exception{
    public MyExcep(String msg){
        super(msg);
    }
}

public class user_ex{
    public static void main(String args[]){
        try{
            throw new MyExcep("Faaltu!!");
        }
        catch(MyExcep me){
            System.out.println("Exception is catched");
            System.out.println("Messege Catched: "+me.getMessage());
        }
    }
}