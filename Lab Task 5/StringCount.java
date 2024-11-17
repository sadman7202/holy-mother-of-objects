public class StringCount {
    public static void main(String[] args) {
Count c=new Count();
SameCharCount s=new SameCharCount();
Replace r=new Replace();
    }
}
class Count{ //11no
    String s="HelloPMeC";
    Count(){
        char tempchar;
        int reminder=0;
        for(int i=0;i<s.length();i++){
            tempchar=s.charAt(i);
            if(tempchar!=' '){
              reminder++;

            }
        }
        System.out.println("Character count is "+reminder);
    }

}
class SameCharCount{ //12no
    String s="daffodil";
    SameCharCount(){
        int reminder=0;
        for(int i=0;i<s.length();i++){
            char temps=s.charAt(i);
            for(int k=i+1;k<s.length();k++){
                if(s.charAt(k)==s.charAt(i)){
                    reminder++;

                }

            }
        }
        System.out.println("The number of same character is: "+reminder);

    }

}
class Replace{ //13no
    String s="Hello World";
    Replace(){
        String s1=s.replace("World","Duniya");
        System.out.println("Original String: "+s+
                "\nReplaced String: "+s1);
    }
}
