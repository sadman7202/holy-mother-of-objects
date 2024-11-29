package labtask6;
//4no
class S{
    void sum(int x,int y){
        System.out.println("Sum is : "+(x+y));
    }
}
class M extends S{
    void multiplication(int a,int b){
        System.out.println("Multiplication is : "+(a*b));
    }
}
public class SM extends M {
    public static void main(String[] args) {
        SM n=new SM();
        n.sum(5,6);
        n.multiplication(3,4);
    }
}
