public class average{
    public static void main(String[] args) {
        int ar1[]={4,8,78,96,36,42,420};
        System.out.print("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");

       }
       int sum=0;
       for(int i=0;i<ar1.length;i++){
        
        sum=sum+ar1[i];

    }
    double average=sum/ar1.length;
    System.out.println("\nAverage of elements is : "+average);
    }
}