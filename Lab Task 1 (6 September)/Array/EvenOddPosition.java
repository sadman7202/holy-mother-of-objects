public class EvenOddPosition {
    public static void main(String[] args) {
        int ar1[]={4,8,78,96,36,42,420};
        System.out.println("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");
       }
       System.out.println("\nEven positioned elemets are: "); 
       for(int i=0;i<ar1.length;i++){
        if(i%2==0){
            System.out.print(ar1[i]+ " ");
        }
       }
       System.out.println("\nOdd positioned elemets are: ");  
       for(int i=0;i<ar1.length;i++){
        if(i%2!=0){
            System.out.print(ar1[i]+ " ");
        }
       }
    }
    
}
