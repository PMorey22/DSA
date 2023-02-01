package Binary_search;

public class celling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16 };
        int target = 15;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                return arr[mid];
            }

        }
        return arr[start];
    }

}
