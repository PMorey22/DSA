
public class Lineara {

    public static void main(String[] args) {

        int[] nums = { 23, 44, 56, 32, 79, 82, 21 };

        int a = 22;
        int ans = linearSearch(nums, a);

        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int num) {
        if (arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == num) {
                return i;
            }
        }

        return 0;
    }
}