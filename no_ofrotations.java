public class no_ofrotations {
    
    public static void main(String[] args) {
        int[] nums = { 4,5,6,7,0,1,2 };
        int pivot=noofrotations(nums);
        System.out.println(pivot+1);
        
    }

  
    static int noofrotations(int[] nums) {
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
