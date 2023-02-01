package Binary_search;

public class first {
    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 3, 4, 15, 18, 20, 34, 40, 41, 42, 48, 50 };
        int[] arr = { 90, 75, 18, 12, 6, 4, 3, 1 };
        int target = 90;
        System.out.print(binarySearch(arr, target));

    }

    // return index

    // //soted in ascend order
    // static int binarySearch(int[] arr, int target) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end) {
    // // int mid=(start+end)/2;
    // int mid = start + (end - start) / 2;

    // if (arr[mid] > target) {
    // end = mid - 1;
    // }

    // else if (arr[mid] < target) {
    // start = mid + 1;
    // }

    // else {
    // return mid;
    // }

    // }
    // return -1;
    // }

    // soted in descend order
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
