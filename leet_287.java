import java.util.Arrays;

public class leet_287 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,5,4,8,7,6};
        int ans=cyclic(arr);
        System.out.println(ans);
    }

    static int cyclic(int[] arr){
        int i=0;
        
        while(i<arr.length){
            if(arr[i]!=i+1){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }

            else{
                return arr[i];
            }
        }
        else
            {i++;}
    }
     return -1;   
        
    }

    

    static int[] swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }

    
        // static int findDuplicate(int[] nums) {
        //     int cnt[]=new int[100001];
        //     for(int i=0;i<nums.length;i++)
        //         cnt[nums[i]]++;
        //     for(int i=0;i<100001;i++)
        //         if(cnt[i]>1)
        //             return i;
        //     return 1;
        // }
    
}
