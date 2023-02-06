public class targetinpeakarray {
    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 3, 4, 15, 18, 20, 34, 40, 41, 42, 48, 50 };
        int[] arr = { 2,4,6,14,27,45,66,78,89,90, 75, 18, 12, 6, 4, 3, 1 };
        System.out.print(search(arr,18));

    }
    static int search(int[] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int try1=binarySearch(arr, target,0,peak);
        if(try1!=-1){
            return try1;
        }
        else{
            return binarySearchdesc(arr, target,peak,arr.length-1);
        }

    }
    
    static int peakIndexInMountainArray(int[] arr) {
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
        return start;
        
        }
         static int binarySearch(int[] arr, int target,int start, int end) {
 

    while (start <= end) {
    // int mid=(start+end)/2;
    int mid = start + (end - start) / 2;

    if (arr[mid] > target) {
    end = mid - 1;
    }

    else if (arr[mid] < target) {
    start = mid + 1;
    }

    else {
    return mid;
    }

    }
    return -1;
    }
    static int binarySearchdesc(int[] arr, int target,int start,int end) {
      

        while (start <= end) {
            // int mid=(start+end)/2;
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                end = mid - 1;
            }

            else if (arr[mid] > target) {
                start = mid + 1;
            }

            else {
                return mid;
            }

        }
        return -1;
    }
}
