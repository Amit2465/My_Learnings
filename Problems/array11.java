package Problems;

public class array11 {
    public static void checkUniqwElement(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                if(num[i]==num[j]){
                    num[i]=-1;
                    num[j]=-1;
                }
            }
        }

        for(int i = 0; i < num.length; i++) {
            if(num[i]!=-1){
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 7, 4, 3, 7 };
        checkUniqwElement(arr);
    }
}
