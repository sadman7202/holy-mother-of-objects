package labtask10;
interface employee{ //1no
    int id=10;
    String name="Rahim";
    int age=45;
    int salary=50000;
    void salary();



}

public class Inerface implements employee{
    public static void main(String[] args) {

        Inerface i=new Inerface();
        i.salary();
    }
    public void salary() {
        System.out.println("ID: "+id+" Name: "+name+" Age: "+age+" Salary "+salary);
    }

}
