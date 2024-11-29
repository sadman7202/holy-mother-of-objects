

class CopyArray{
    public static void main(String[] args) {
        int [] arr1={1,8,7,5,10,45};
        int [] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];

        }
        System.out.println("array 2 is : ");
        for(int j=0;j<arr1.length;j++){
            System.out.println(arr1[j]);

        }



    }



}