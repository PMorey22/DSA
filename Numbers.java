package Pattern;

public class Numbers {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                System.out.print((count));
            }

            System.out.println();
        }

    }
}
