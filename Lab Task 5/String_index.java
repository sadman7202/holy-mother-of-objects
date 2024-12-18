import java.sql.SQLOutput;

class String_Index{
    public static void main(String[] args) {
       PerticulerIndex p=new PerticulerIndex();

       IndexOfSubstring i=new IndexOfSubstring();
       IndexOfSubstring2 i2=new IndexOfSubstring2();
    }

}
class PerticulerIndex{ //6no
    String s="Sadman";
    PerticulerIndex(){
        System.out.println("In String "+s+" Character at 3 index is : "+s.charAt(3));
    }
}
class FindIndex{ //7no
    String s="HelloPMeC";
    FindIndex(){
        System.out.println("In String "+s+" The 'e' Index at: "+s.indexOf('e'));
    }
}
class FindIndext2 { //8no
    String s = "HelloPMeC";

    FindIndext2() {
        System.out.println("In String " + s + " The 'e' Index at: " + s.indexOf('e', 2)+
                "If index starts from 2");

    }
}
class IndexOfSubstring{ //9no
    String s="HelloPMeC";
    IndexOfSubstring(){
        System.out.println("In String "+s+" Substring 'loP' at index : "+s.indexOf("loP"));
    }
}
class IndexOfSubstring2{ //10no
    String s="HelloPMeC";
    IndexOfSubstring2(){
        System.out.println("In String "+s+" Substring 'loP' at index : "+s.indexOf("loP",5)
            +" If index starts from 5 ");
    }
}
