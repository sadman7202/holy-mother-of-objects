public class searchElement {
    public static void main(String[] args) {
        int ar1[]={4,8,78,96,36,42,420};
        System.out.print("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");

       }
       int result=0;
       for(int i=0;i<ar1.length;i++){
        if(ar1[i]==36){
            result=i;
             
             break;
        }
       }
       
       if(result!=0){
        System.out.println("\nThe expected index is : "+result);
       }
       else
       System.out.println("No index found");
       
    }
    
}
