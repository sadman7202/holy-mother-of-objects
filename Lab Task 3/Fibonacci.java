public class Fibonacci {
    public static void main(String[] args) {
        int limit=15,first=0,second=1,next;
        System.out.println("The fibonacci series of limit of 15 is:");
        
        for(int i=3;i<=limit;i++){
            next=first+second;
            System.out.print(next+",");
            first=second;
            second=next;
            

        }
        

    }
}
