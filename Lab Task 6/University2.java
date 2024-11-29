package labtask6;

public class University2 {   //2no
    String Uni_name;
}
class College2 extends University2{
    String College_name;
            void show(){
                College_name="Shahid Police Smrity College";
                Uni_name="Daffodil International University";
                System.out.println(College_name+"\n"+Uni_name);
            }

    public static void main(String[] args) {
        College2 c=new College2();
        c.show();
    }
}

