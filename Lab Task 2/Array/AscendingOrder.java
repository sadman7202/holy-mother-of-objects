public class AscendingOrder {
    public static void main(String[] args) {
        
        int ar1[]={4,8,78,96,36,42,420};
        System.out.print("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");
       }
       int temp;
       for(int i=0;i<ar1.length;i++){
        for(int j=i+1;j<ar1.length;j++){
            if(ar1[i]>ar1[j]){
            temp=ar1[i];
            ar1[i]=ar1[j];
            ar1[j]=temp;
            }

        }
       }
       System.out.print("\nSorted array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");
       }
       
    }
    
}
