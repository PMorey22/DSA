import java.util.Arrays;

public class leet_268 {
    public static void main(String[] args) {
        int[] arr={2,0,3,1};
        int miss=missno(arr);
        System.out.println(miss);
    }

//     static int cyclic(int[] arr)
//     {
//         int i=0;
        
//         while(i<arr.length){
//             int correct=arr[i];
//             if(arr[i]< arr.length && arr[i]!=arr[correct]){
//                 swap(arr, i, correct);
//             }
//             else{
//                 i++;
//             }
//         }
//         for(int j=0;j<arr.length;j++){
//             if(arr[j]!=j){
//                 return j;
//             }  
//         }
//         return arr.length;
//     }


//     static void swap(int[] arr, int first, int second){
//         int temp=arr[first];
//         arr[first]=arr[second];
//         arr[second]=temp;
    
    
// }

static int missno(int[] arr){
    int expSum=arr.length*(arr.length+1)/2;
    int actualSun=0;
    for(int nums:arr){
        actualSun=actualSun+nums;
    }
    return expSum-actualSun;
}
    
}
