public class rotatedarray {
    public static void main(String[] args) {
        int[] nums = { 3,5,1 };
        int target = 3;
        System.out.println(search(nums,target));
        System.out.println(pivot(nums));
        
    }

    static int  search(int[] nums, int target) {
        int pivot=pivot(nums);
        //if no pivot = no rotation so normal binary numsay
        if(pivot==-1){
            return binarySearch(nums, target,0,nums.length-1);
        }
        //but if pivot found then there are two ascending numsays so now we need to decide which numsay our taget lien in
        if(nums[pivot]==target){
        return pivot;
       }
       if(target>=nums[0]){
        return binarySearch(nums, target, 0, pivot-1);
       }
      
       return binarySearch(nums, target,pivot+1, nums.length-1);
       



    }
    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
    
        while (start <= end) {
        // int mid=(start+end)/2;
        int mid = start + (end - start) / 2;
        
        //4 cases
    
        if (mid<end && nums[mid] > nums[mid+1]) {
        return mid;
        }
    
        else if (mid>=1 && nums[mid-1] >nums[mid]) {
        return mid-1;
        }
    
        else if(nums[start]>=nums[mid]){
        end=mid-1;
        }
    
        else if(nums[start]<=nums[mid]){
            start=mid+1;
            }
    
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target,int start, int end) {
    
        while (start <= end) {
        // int mid=(start+end)/2;
        int mid = start + (end - start) / 2;
    
        if (nums[mid] > target) {
        end = mid - 1;
        }
    
        else if (nums[mid] < target) {
        start = mid + 1;
        }
    
        else {
        return mid;
        }
    
        }
        return -1;
        }
}




