import java.util.Arrays;

public class Insetion_Sort {
    public static void main(String[] args) {
        int[] arr={2,4,3,1,5};
        System.out.println(Arrays.toString(Insertion(arr)));
    }

    static int[] Insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;   
                }
                if(arr[j]>arr[j-1]) continue;
            }
        }
        return arr;       
    }
    
}
