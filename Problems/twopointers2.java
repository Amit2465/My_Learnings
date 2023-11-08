package Problems;

public class twopointers2 {

    public static void swapOddAndEven(int num[]) {
        int n = num.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (num[left] % 2 == 1 && num[right] % 2 == 0) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
            if (num[left] % 2 == 0) {
                left++;
            }
            if (num[right] % 2 == 1) {
                right--;
            }
        }

        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4, 5, 7 };
        swapOddAndEven(arr);
    }
}
