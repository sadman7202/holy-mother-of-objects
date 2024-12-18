package final_solve;
// 1.b Given the following class definitions  create an instance of the subclass and call its inherited method

class Vehicle{
    void  start(){
        System.out.println("Vehicle Started");
    }
}
class car extends Vehicle {
    public static void main(String[] args) {
        car c=new car();
        c.start();
    }
}


