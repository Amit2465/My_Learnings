package DSA;

public class BinarySearch1 {

    public static int binarySearch(int num[], int target){
        
        int start=0;
        int end=num.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<num[mid]){
                end = mid-1;
            }else if(target>num[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int target = 1;
        int arr[]={0, 1, 3, 7, 12, 18, 19, 22, 23};
        int result= binarySearch(arr, target);
        System.out.println(result);
    }
    
}
