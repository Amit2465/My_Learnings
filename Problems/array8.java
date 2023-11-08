package Problems;

public class array8 {
    public static void main(String[] args) {
        int num[] = {2, 7, 11, 15};
        int target = 9;
        boolean pairFound = false;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    pairFound = true;
                }
            }
        }

        if (!pairFound) {
            System.out.println("No pair found that sums up to the target.");
        }
    }
}

