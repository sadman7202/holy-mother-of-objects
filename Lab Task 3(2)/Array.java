package labtask3;

public class Array {
    int ar1[]={4,8,78,96,36,42,420};
    int sum=0;
    void sum(){ //1no

        System.out.print("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");
        }

        for(int i=0;i<ar1.length;i++){

            sum=sum+ar1[i];

        }
        System.out.println("\nThe sum is "+sum);
    }
    void average(){ //2no

        for(int i=0;i<ar1.length;i++){

            sum=sum+ar1[i];

        }
        System.out.println("Average of array is: "+(sum/ ar1.length));
    }
    void largest(){ //3no
    System.out.print("\nLargest element is: ");
    int max=ar1[0];
    for(int j=0;j<ar1.length;j++){
        if(ar1[j]>max)
            max=ar1[j];

    }
        System.out.print(max);
}
void smallest(){ //4no
    System.out.print("\nSmallest element is: ");
    int min=ar1[0];
    for(int i=0;i<ar1.length;i++){
        if(ar1[i]<min)
            min=ar1[i];
    }
    System.out.print(min);
}
    void reverse(){ //5no
        System.out.println("\nReverse Array is : ");
        for(int i=ar1.length-1;i>=0;i--){
            System.out.print(ar1[i]+ " ");
        }
    }
    void search(){ //6no
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]==75){
                System.out.println("The number 75 is at index of: "+i);
                break;
            }
        }
    }
    void evenodd(){ //7no
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
    void sorting(){ //8no
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

    public static void main(String[] args) {
        Array a=new Array();
        a.sum();
        a.average();
        a.evenodd();
        a.largest();
        a.smallest();
        a.reverse();
        a.search();
        a.sorting();

    }
}




