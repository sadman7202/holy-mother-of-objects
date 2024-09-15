public class LargeSmallElemets {
    public static void main(String[] args) {
        int ar1[]={4,8,78,96,36,42,420};
        System.out.println("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");
       }
       System.out.print("\nLargest element is: ");
       int max=ar1[0];
       for(int j=0;j<ar1.length;j++){
       if(ar1[j]>max)
        max=ar1[j];
    }
    System.out.print(max);
    System.out.print("\nSmallest element is: ");
    int min=ar1[0];
    for(int i=0;i<ar1.length;i++){
        if(ar1[i]<min)
         min=ar1[i];
}
    System.out.print(min);
}
}
