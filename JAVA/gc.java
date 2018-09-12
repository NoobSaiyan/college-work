class stu{
    public static void main(String[] args){
        stu s=new stu();
        s = null;
        System.gc();
    }
    protected void finalize(){
        System.out.println("GARBAGE"+this);
    }
}