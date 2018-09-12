
class rigged{
   
    public static void main(String args[]){
        Bank b;
        b  = new SBI();
        b.ratio();
        b = new PNB();
        b.ratio();
        b = new SBP();
        b.ratio();
        b = new ICICI();
        b.ratio();
        show s = new show();
        s.my_method();
    }    
    
}


class Bank{
    void ratio(){
        System.out.println("0% here");
    }
    
}
    class SBI extends Bank{
        void ratio(){
            System.out.println("5% here");
        }
    }
    class PNB extends Bank{
        void ratio(){
            System.out.println("10% here");
        }
    }
    class SBP extends Bank{
        void ratio(){
            System.out.println("18% here");
        }
    }
    class ICICI extends Bank{
        void ratio(){
            System.out.println("20% here");
        }
    }
    class show extends Bank{
        public void my_method(){
            super.ratio();
        }
    }