public class factors 
{
    public static void main(String[] args) {
        int num=20;
        System.out.println("Factors of 20 are: ");
        for(int i=1;i<=20;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
