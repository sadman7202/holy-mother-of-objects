public class EvenOddElements {
public static void main(String[] args) {
    int ar1[]={4,8,37,78,21,96,36,5,42,13,420};
        System.out.print("array 1 is : ");
        for(int j=0;j<ar1.length;j++){
            System.out.print(ar1[j]+ " ");
       }
    System.out.println("\nThe even elements are: ");
    for(int i=0;i<ar1.length;i++){
        if(ar1[i]%2==0){
            System.out.print(ar1[i]+" ");
        }
    }
    System.out.println("\nThe odd elements are: ");
    for(int j=0;j<ar1.length;j++){
        if(ar1[j]%2!=0){
            System.out.print(ar1[j]+" ");
        }

}    
}
}
