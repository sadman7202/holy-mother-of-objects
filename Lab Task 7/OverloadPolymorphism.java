package labtask8;

public class OverloadPolymorphism { //2no
    void display(int value){
        System.out.println(value);
    }
    void display(double value){
        System.out.println(value);
    }
    void display(float value){
        System.out.println(value);
    }
    void display(char value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        OverloadPolymorphism o = new OverloadPolymorphism();
        o.display(11);
        o.display(11.5f);
        o.display(11.3);
        o.display('F');
    }
}

