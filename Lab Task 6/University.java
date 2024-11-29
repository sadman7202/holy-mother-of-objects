package labtask6;

public class University { //1no
    void display(){
        System.out.println("Daffodil International University");
    }
}
class College extends University{
    void show(){
        System.out.println("Shahid Police Smrity College");
    }

    public static void main(String[] args) {
        College c= new College();
        c.show();
        c.display();
    }
}

