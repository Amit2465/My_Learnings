package DSA;

public class BinarySearch5 {

    public static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};

        // check the first occerence
        int start= search(nums, target, true);
        int end= search(nums,target,false);
        
        ans[0]=start;
        ans[1]=end;
        return ans;                
    }   
    
    // This function just returns rhe index value of target 

    static int search(int nums[], int target, boolean findStartindex){
        int start=0;
        int end=nums.length-1;
        int ans=-1 ;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else if (target<nums[mid]){
                end=mid-1;
            }else{
                ans=mid;
                if(findStartindex){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,7,7,7,7,8,9};
        int target=7;

        int result[] = searchRange(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

