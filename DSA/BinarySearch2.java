package DSA;

public class BinarySearch2 {
    // celling means smallest number greater than equal to target number.

    public static int ceilingOfArray (int num[], int target){
        int start=0;
        int end=num.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>num[mid]){
                start=mid+1;
            }else if(target<num[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,8,9};
        int target=6;
        int result= ceilingOfArray(arr, target);
        System.out.println(result);
      
    }
    
}
