public class RightRotation {
    public static void main(String[] args) {
        int arr[]={2,7,9,52,10,36};int j;
        System.out.println("Original array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        int last=arr[arr.length-1];
        
        for(j=arr.length-1;j>0;j--){
            arr[j]=arr[j-1];

        }
        arr[j]=last;
        System.out.println("The rotated array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
