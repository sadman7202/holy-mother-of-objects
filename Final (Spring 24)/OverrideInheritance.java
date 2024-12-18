package final_solve;
//write a program that demonstrate the concept of polymorphism with method overriding and inheritance

class University{
     void display(){
        System.out.println("Daffodil International University");
    }
}
public class OverrideInheritance extends University {
    public static void main(String[] args) {
       University u=new University();
       OverrideInheritance o=new OverrideInheritance();
       u.display();
       o.display();
    }
    void display(){
        System.out.println("Shaheed Police Smrity College");
    }
}
