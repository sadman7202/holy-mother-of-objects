package labtask10;

public class SimpleException {
    void DivideByzero(){ //2no
        try{
            int i=15/0;

        }
        catch (ArithmeticException e){
            System.out.println("Could not execute because: "+e);
        }
    }
    void IndexOutOfBound(){ //3no
        int array[]={12,45,36};
        try {
            System.out.println(array[5]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Could not print index of 5 because : "+e);
        }
    }
    void MultipleException(){ //4no
        try{
            int i=134/0;

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Could not execute because: "+e);
        }
        catch (Exception e){
            System.out.println("Could not execute because: "+e);
        }
    }
    void Finally(){ //7no
        try{
            int j=316/0;
        }
        finally {
            int sum=0;
            for(int i=0;i<=5;i++){
               sum+=i;
            }
            int result=sum/5;
            System.out.println("Result is: "+result);
        }
    }

    public static void main(String[] args) {
      SimpleException e=new SimpleException();
      e.DivideByzero();
      e.IndexOutOfBound();
      e.MultipleException();
      e.Finally();
      X obj=new X();
      //obj.Y();
      try{
          obj.Z();
      }
      catch (ArrayIndexOutOfBoundsException f){
          System.out.println("caught"+ f);
      }

    }
}
class X {
    void Y() {//5no
        int i = 10;
        if (i < 18) {
            throw new ArithmeticException("Exception is Thrown");
        }
    }
    void Z()throws ArrayIndexOutOfBoundsException{ //6no
        throw new ArithmeticException("Test Exception");
    }
}
