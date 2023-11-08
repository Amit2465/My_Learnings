package Basic_java;

public class methods2 {
    static int addTwoNumbers(int a, int b){
        int sum=0;
         sum= a+ b;
         return sum;
    } 
    
    public static void main(String[] args) {
        int result=addTwoNumbers(10,20);
        System.out.println(result);
    }
}
