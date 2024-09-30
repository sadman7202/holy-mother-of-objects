
class Test {
    int a,b,c;
    int add(int x,int y){
        a=x;
        b=y;
        return a+b;
    }
    int add (int x,int y,int z){
        a=x;
        b=y;
        c=z;
        return a+b+c;
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
      Test t=new Test();
      System.out.println(t.add(12,34));
      System.out.println(t.add(3,16,70));

    }
    
}
