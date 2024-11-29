package labtask6;

public class Addition { //3no
    void display(){
        int sum=0;
        for(int i=100;i<=150;i++){
            sum+=i;
        }
        System.out.println("Sum is : "+sum);
    }
}
class Sum extends Addition{
    public static void main(String[] args) {
        Sum s=new Sum();
        s.display();
    }
}

