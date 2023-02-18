import java.util.Scanner;
 
public class numGame{
 
    public static void guessingnumGame()
     {
        Scanner sc = new Scanner(System.in);
 
        int num = 1 + (int)(100
                               * Math.random());
 
        
        int chance = 5;
 
        int i, guess;
 
        System.out.println(
            "Guess the number"
            + " between 1 to 100."
            + " within 5 trials.");
 
        // Iterate over chance Trials
        for (i = 0; i < chance; i++) {
 
            System.out.println(
                "Guess the num:");
 
            // Tachancee input for guessing
            guess = sc.nextInt();
 
            // If the num is guessed
            if (num == guess) {
                System.out.println(
                    "Wohoo"
                    + " You guessed the num.");
                break;
            }
            else if (num > guess
                     && i != chance - 1) {
                System.out.println(
                    "The num is "
                    + "bigger than" + guess);
            }
            else if (num < guess
                     && i != chance - 1) {
                System.out.println(
                    "The num is"
                    + " smaller than " + guess);
            }
        }
 
        if (i == chance) {
            System.out.println(
                "You have exhausted"
                + " chance trials.");
 
            System.out.println(
                "The num was " + num);
        }
    }

 
    // Driver Code
    public static void
    main(String arg[])
    {
 
        // Function Call
        guessingnumGame();
    }
}