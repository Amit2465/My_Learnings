package DSA;

public class BinarySearch6 {

    public static int findNumInInfiniteArray(int num[], int target,int start,int end) {
        
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

        return -1;
    }

    static int findRange(int num[], int target){
        // first find the range
        //fist start with the box of 2;
        int start=0;
        int end=1;

        // condition for the target to lie in the range

        while(target>num[end]){
            int temp=end+1;//this is my new start
            // end = previous end + sizeOfBox*2; 
            end= end +(end - start +1)*2;
            start=temp;
        }

        return findNumInInfiniteArray(num, target, start, end);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,8,9,10,11,12,13,14,15,16,17,18};
        int target = 14; 
        int result = findRange(arr, target);
        System.out.println(result);       
        
    }
    
}
