package final_solve;
//Determine the out and explain why
public class StringOutput {
    public static void main(String[] args) {
       String str1="Hello";
       String str2=new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
/* == compares references (memory addresses). It checks whether str1 and str2 point to the same object.
    str2 is explicitly created using new String("Hello"), so it refers to a different object in the heap.
    Therefore, str1 and str2 have different references.
                               Output: false   */
/*  .equals() checks content equality. It compares the actual string values.
          Both str1 and str2 have the same content, "Hello".Therefore, .equals() returns true.
                               Output: true
 */