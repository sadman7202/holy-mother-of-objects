package final_solve;
//Write a progaram that demonstrate try catch block by handling an ArrayIndexOutOfBoundsException

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int[] numbers = new int[2];
            numbers[0]=1;
            numbers[1]=2;

            System.out.println(numbers[2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
