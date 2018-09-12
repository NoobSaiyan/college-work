class gar{
    int x=0;
    int m=0;
    String huh="";

    gar(int a){
        this.x = a;
    }
    gar(int r,String hmm){
        this.m=r;
        this.huh=hmm;
    }

    public static void main(String[] args){
        gar s=new gar(26);
        gar p=new gar(82,"Aloo");
        s=null;
        s=p;
        System.gc();
    }
        
    protected void finalize(){
        //System.out.println("GARBAGE 1 !! "+this.x);
        System.out.println("GARBAGE 2 !! "+this.huh+this.x);
    }
}