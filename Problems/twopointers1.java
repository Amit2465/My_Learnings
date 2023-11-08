package Problems;

public class twopointers1 {

    public static void zeroAndOne(int num[]){
        int n = num.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(num[left]==1 && num[right]==0){
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }

            if(num[left]==0){
                left++;
            }

            if(num[right]==1){
                right--;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(num[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0,1,0,1,0};
        zeroAndOne(arr);
    }
}
