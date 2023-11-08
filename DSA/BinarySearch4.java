package DSA;

public class BinarySearch4 {

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        
        char[] letters = {'c', 'f', 'j'};
        char target='c';

        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

}
