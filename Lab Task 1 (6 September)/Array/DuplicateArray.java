public class DuplicateArray {
    public static void main(String[] args) {
        int arr1[]={4,6,5,3,6,7,10,9,7,10};
        System.out.println("Duplicate elemets are: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    System.out.print(arr1[i]+ " ");
                }

                
            }

        }
    }
    
}
