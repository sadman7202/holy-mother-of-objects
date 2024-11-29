
    public class Primenumber {
        public static void main(String[] args) {
          int number = 12, i,reminder=0;
    
        
    
        for (i = 2;i < number; i++) {
            if (number % i == 0) {
                reminder=1;
            }
        }
        if(reminder==1){
            System.out.println(number+" is not a prime number");
        }
        else{
        System.out.println(number+" is a prime number");
        }
    }
}
    
           
        
        
    

       
    