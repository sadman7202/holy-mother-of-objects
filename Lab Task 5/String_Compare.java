public class String_Compare {
    public static void main(String[] args) {
        equalKeyword k=new equalKeyword();
        equalOperator o=new equalOperator();
        CompareTo c=new CompareTo();

    }


static class equalKeyword{ //3no
    equalKeyword(){
        String s1="Daffodil";
        String s2 = "Daffodil";
        String s3="University";
        boolean b=s1.equals(s2);
        System.out.println(b);
    }
}
static class equalOperator{ //4no
    String s1="Daffodil";
    String s2 = "Daffodil";
    String s3="University";
    equalOperator(){
        boolean b2=s1==s3;
        System.out.println(b2);
    }
}
static class CompareTo{ //5no
    String s1="Daffodil";
    String s2 = "Daffodil";
    String s3="University";
    CompareTo(){
        int r=s1.compareTo(s3);//using compareTo() keyword
        if(r>0){
            System.out.println(s1+" word is bigger than "+s3);
        }
        else if(r<0){
            System.out.println(s1+" word is smaller than "+s3);
        }
        else {
            System.out.println(s1+" word is equal than "+s3);
        }
    }
    }
}
