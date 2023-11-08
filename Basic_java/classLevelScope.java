package Basic_java;

public class classLevelScope {

    int a =10;
    int b=20;
    
    int add (){
        return a+b;

    }

    {
        int c=30;
        System.out.println(c);
       
    }
    
    public static void main(String[] args) {
       
    }
}
