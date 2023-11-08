package Problems;

public class loop11 {
    public static void main(String[] args) {
        int r = 4;       

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
