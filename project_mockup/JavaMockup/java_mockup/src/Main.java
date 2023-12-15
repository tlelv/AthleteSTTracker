import java.util.Scanner;

public class Main {

    // defines constants for menu item choices, would probably be better as
    // an enumerated type
    private static final int LOGIN = 1;
    private static final int NEW_USER = 2;
    private static final int QUIT_PROGRAM = 3;

    // private constant values
    private static final int LOW_MENU_CHOICE = 1;
    private static final int HIGH_MENU_CHOICE = QUIT_PROGRAM;


    public static void main(String[] args) {
        int userChoice = -1;
        String[] userInfo = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Athlete Tracker Program 1.0!");

        System.out.println();
        while (userChoice != QUIT_PROGRAM) {
            displayMenu();

            userChoice = getUserMenuInput(input);

            System.out.println();

            switch (userChoice) {
                case LOGIN:
                    //LOGIN code
                    break;

                case NEW_USER:
                    userInfo = fillUserInfo(input);
                    break;

                case QUIT_PROGRAM:
                    System.out.print("Thanks for using the Athlete Tracker Program");
                    System.out.println(" Program 1.0!");
                    System.exit(0);

                    break;

                default:
                    System.out.println("ERROR: This should not be possible!");
                    System.out.println("Why do humans always break things?");
                    System.out.println("The robot overlords are displeased...");

                    break;
            }

            System.out.println();
        }
    }


    /**
     * Displays the menu interface to standard output
     */
    private static void displayMenu() {
        System.out.println("Athlete Tracker Main Menu: ");
        System.out.println("--------------------------------------");
        System.out.println(" " + LOGIN + ". Login");
        System.out.println(" " + NEW_USER + ". New User");
        System.out.println(" " + QUIT_PROGRAM + ". Quit Program");
        System.out.println("--------------------------------------");
    }

    /**
     * Obtains the user input for the menu selection. Ensures that the user
     * choice is a valid value based on the current menu options.
     *
     * @param input the scanner object used for input
     * @return an integer corresponding to the user selection
     */
    private static int getUserMenuInput(Scanner input) {
        String userChoice = "";
        int intChoice = -1;

        // keep looping until the choice is valid
        while (intChoice < LOW_MENU_CHOICE || intChoice > HIGH_MENU_CHOICE) {
            System.out.print("Enter selection (" + LOW_MENU_CHOICE + " - "
                    + HIGH_MENU_CHOICE + "): ");
            userChoice = input.nextLine();

            // if the choice is not a positive integer, ask again
            while (!isPositiveInteger(userChoice)) {
                System.out.println("ERROR: Invalid choice!");
                System.out.print("Enter selection (" + LOW_MENU_CHOICE + " - "
                        + HIGH_MENU_CHOICE + "): ");
                userChoice = input.nextLine();
            }

            // parse the integer when it is safe to do so
            intChoice = Integer.parseInt(userChoice);

            // display an error if the choice is not valid
            if (intChoice < LOW_MENU_CHOICE || intChoice > HIGH_MENU_CHOICE) {
                System.out.println("ERROR: Invalid choice!");
            }
        }

        return intChoice;
    }

    /**
     * Determines whether a given string is a positive integer value
     *
     * @param strNum string containing value to check for being a positive
     * integer
     *
     * @return true is the string contains a positive integer, false otherwise
     */
    private static boolean isPositiveInteger(String strNum)
    {
        final char LOW_INT_VALUE = '0';
        final char HIGH_INT_VALUE = '9';
        final String BAD_STRING = "";

        // if the string is null or empty, it is not valid
        if (strNum == null || strNum.equals(BAD_STRING))
        {
            return false;
        }

        // check each character, making sure it is between 0 and 9 inclusive
        for (int i = 0; i < strNum.length(); i++)
        {
            if (strNum.charAt(i) < LOW_INT_VALUE
                    || strNum.charAt(i) > HIGH_INT_VALUE)
            {
                return false;
            }
        }

        // all tests passed, so string contains a positive integer
        return true;
    }

    public static String[] fillUserInfo(Scanner input) {
        String[] userInfo = null;
        int choice = -1;

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Enter 1 for Trainer");
        System.out.println("Enter 2 for Athlete");
        System.out.println();
        choice = input.nextInt();
        while (choice == -1) {
            System.out.println();
            System.out.println("Enter a valid option (1 or 2)");
            choice = input.nextInt();
        }
        

        return userInfo;
    }

}