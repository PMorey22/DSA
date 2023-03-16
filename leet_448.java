
import java.util.ArrayList;
import java.util.List;

public class leet_448 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,3,3,8}  ;
        System.out.println(cyclic(nums));
    }
    static List<Integer> cyclic(int[] nums)
    {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        //find missing no
        List<Integer> ans= new ArrayList<>();
       for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            ans.add(j+1);
        }
       }
        return ans;
    }

    static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
