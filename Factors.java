import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int number = sc.nextInt();

        // while (n > 0) {
        // if (n % 2 == 0) {
        // System.out.print("2,");
        // n = n / 2;
        // }
        // if (n % 3 == 0) {
        // System.out.print("3,");
        // n = n / 3;
        // }
        // if (n % 5 == 0) {
        // System.out.print("5,");
        // n = n / 5;
        // }
        // if (n % 7 == 0) {
        // System.out.print("7,");
        // n = n / 7;
        // }

        // }
        // System.out.print(n);
        for (int i = 1; i <= number; ++i) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            sc.close();
        }
    }

}
