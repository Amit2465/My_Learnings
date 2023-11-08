package DSA;

 class binarySearch3{

    // gratest number smaller or equal to target number

    public static int floorOfArray (int num[], int target){
        int start=0;
        int end=num.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>num[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,8,9};
        int target=6;
        int result= floorOfArray(arr, target);
        System.out.println(result);
      
    }

 }