class InheritaceConstructor{
    int num=0;
    void InheritanceConstructor(int num){
        this.num =num;
    }
    void display(){
        System.out.println("Changed using sub class"+num);
    }
    public static void main(String args[]){
        InheritaceConstructor IC = new InheritaceConstructor();
        IC.display();
    }
}
class Sub extends InheritaceConstructor{
    Sub(int num){
        super(num);
    }
    Sub s = new Sub(24);
}