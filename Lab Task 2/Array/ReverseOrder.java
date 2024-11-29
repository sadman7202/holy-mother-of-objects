public class ReverseOrder {
    public static void main(String[] args) {
        int ar1[]={4,8,78,96,36,42,420};
        System.out.println("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");
       }
       System.out.println("\nReverse Array is : ");
       for(int i=ar1.length-1;i>=0;i--){
        System.out.print(ar1[i]+ " ");
       }
       
    
}
}
