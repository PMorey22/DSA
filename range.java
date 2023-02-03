package Binary_search;

public class range{
    public static void main(String[] args) {
        int[] arr={ 2, 3, 5, 7, 7, 7, 7, 7, 9, 14, 16 };
        int target = 7;
        System.out.println(searchRange(arr, target));
    }

    static int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);
        ans[1]=end;
        ans[0]=start;
        return ans;
        
    }

    static int search(int[] nums, int target, boolean findStarIndex){
        int ans=-1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            }

            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                 ans=mid;// possible ans found
            if(findStarIndex){
                end=mid-1;
            }
            else{
                start=mid+1;
            }          

        }
    }
    return ans;
  }
}
