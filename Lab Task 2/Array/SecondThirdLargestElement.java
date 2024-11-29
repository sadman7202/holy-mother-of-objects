public class SecondThirdLargestElement {
    public static void main(String[] args) {
        
        int arr[] = {2, 7, 9, 52, 10, 36};
        System.out.println("Original array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }

        System.out.print("\nThe first, second, and third largest numbers are: " + first + ", " + second + ", " + third);
    }
}
