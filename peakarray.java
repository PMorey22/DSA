public class peakarray {
    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 3, 4, 15, 18, 20, 34, 40, 41, 42, 48, 50 };
        int[] arr = { 90, 75, 18, 12, 6, 4, 3, 1 };
        System.out.print(peakIndexMountainArray(arr));

    }
    
    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start < end) {
        // int mid=(start+end)/2;
        int mid = start + (end - start) / 2;
    
        if (arr[mid] > arr[mid+1]) {
        end = mid;
        }
    
        else {
        start = mid + 1;
        }
    
        // else {
        // return mid;
        // }
    
        }
        return arr[start];
        
        }
    
}
