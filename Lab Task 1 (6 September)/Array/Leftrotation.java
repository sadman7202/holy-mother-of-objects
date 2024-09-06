public class Leftrotation {

    public static void main(String[] args) {
        int arr[]={2,7,9,52,10,36};int j;
        System.out.println("Original array is");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        int first=arr[0];
        
        for(j=0;j<arr.length-1;j++){
            arr[j]=arr[j+1];

        }
        arr[j]=first;
        System.out.println("The rotated array is :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

       
    }
}
