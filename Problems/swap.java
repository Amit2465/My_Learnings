package Problems;

public class swap {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Before swap: "+a+", "+b);
        int temp;
        
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swap: "+a+", "+b);
    }
    
}
