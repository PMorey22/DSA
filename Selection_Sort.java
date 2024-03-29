  
import java.util.Arrays;

public class Selection_Sort{
    public static void main(String[] args) {
        int[] arr={2,3,1,5,4};
        selection(arr);
    }

 static void selection(int[] arr){
    for(int i=0;i<arr.length;i++){
      int last=arr.length-i-1;
      int maxIndex=getMaxIndex(arr,0,last);
      swap(arr, maxIndex, last);

    }
    System.out.println(Arrays.toString(arr));

 }

 static int getMaxIndex(int[] arr,int start, int last){
    int max=start;
    for(int i=start;i<last;i++){
        if(arr[i]>arr[max]){
            max=i;
        }
    }
    return max;
 }

 static void swap(int[] arr, int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
 }
}