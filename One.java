import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int[] arr={};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run steos n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //fir each step, max item will come at last respective
            for(int j=1;j<arr.length-i;j++){
                //swap if the item smaller than prev item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
}
