
class Test{
    int a,b,c,id;
    String name, city;
    Test(int i, String n){
        id=i;
        name=n;
    }
    Test(int i, String n, String c){
        id=i;
        name=n;
        city=c;
    }
    int add(int n1,int n2){
        a=n1;
        b=n2;
        return  a+b;
    }
    int add(int n1, int n2, int n3){
        a=n1;
        b=n2;
        c=n3;
        return a+b+c;
    }
    void display(){
        System.out.println("ID: "+id+" Name: "+name+" City: "+city);
    }
}
public class Overload_L5P1 {
        public static void main(String[] args) {
            Test t1=new Test(11,"Abid");
            Test t2=new Test(31,"Iqram","Gazipur");
            System.out.println("Sum: "+t1.add(12,13));
            System.out.println("Sum: "+t2.add(2,4,3));
            t1.display();
            t2.display();
        }
    }
