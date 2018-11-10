public class trying{
    public static void main(String srgs[]){
        int a=60;
        try{
            a = a/0;
            System.out.println("This is try block result: "+a);
        }
        catch(ArithmeticException ae){
            a= a/20;
            System.out.println("This is catch block result: "+a);
        }
        finally{
            System.out.println("This is finally block result: "+a);
        }
        System.out.println("This is ouside try and catch result: "+a);
    }
}