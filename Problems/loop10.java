package Problems;

public class loop10 {
    public static void main(String[] args) {
        int r=4;
        int c=4;

        for (int i=0; i<=r; i++) {
            for (int j=i; j<=c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
