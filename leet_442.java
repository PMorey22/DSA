import java.util.ArrayList;

public class leet_442 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,5,5,8,7,7};
        System.out.println(cyclic(arr));
    }

     static ArrayList cyclic(int[] arr){
        ArrayList<Integer> ans= new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }

            else{
                ans.add(i);;
            }
        }
        else
            {i++;}
    }
     return ans;  
        
    }

    

    static int[] swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }

    
    // static ArrayList findDuplicate(int[] nums) {
    //     ArrayList<Integer> ans= new ArrayList<>();
    //     int cnt[]=new int[100001];
    //     for(int i=0;i<nums.length;i++)
    //         cnt[nums[i]]++;
    //     for(int i=0;i<100001;i++)
    //         if(cnt[i]>1)
    //             ans.add(i);
    //     return ans;
    // }

}
