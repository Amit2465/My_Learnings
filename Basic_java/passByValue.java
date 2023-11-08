package Basic_java;

public class passByValue {

    static int sum (int a , int b){
        return a + b;
    } 
    public static void main(String[] args) {
        
        int x=10, y=20;

        System.out.println(sum(x, y));// here we pass the argument by values
    }
}
