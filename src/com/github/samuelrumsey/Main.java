package com.github.samuelrumsey;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static UserEncourager encourager = new UserEncourager();

    private static final String PROMPT = "Hi! What's your full name?";
    private static final String INVALID_NAME = "That's not a full name! Try again.";

    public static void main(String[] args) {
        encourager.encourageUser(getCurrentUser());
    }

    /**
     * Prompts the user currently running the program for their information.
     * @return a user object with information from the program runner
     */
    private static User getCurrentUser() {
        System.out.println(PROMPT);

        String name = getUserInput();
        while(!isNameValid(name)) {
            System.out.println(INVALID_NAME);
            name = getUserInput();
        }

        return getUserFromString(name);
    }

    private static String getUserInput() {
        return scanner.nextLine();
    }

    /**
     * A name is valid if it has a first, middle, and last section separated by spaces.
     * An example of a proper name is John Wallace Doe. John Doe, or John Doe Wallace Fred, are not proper names.
     * @param name name to check
     * @return true if the given name is valid
     */
    private static boolean isNameValid(String name) {
        return name.split(" ").length == 3;
    }

    /**
     * Turns the given name (stored in a string) into a {@link User}.
     * @param name name to convert to a User.
     * @return User with name set
     */
    private static User getUserFromString(String name) {
        String[] splitName = name.split(" ");
        return new User(correctStringCapitalization(splitName[0]), correctStringCapitalization(splitName[1]), correctStringCapitalization(splitName[2]));
    }

    /**
     * Properly capitalizes the given string, assuming it is a noun or portion of a name.
     * The first letter of the string is capitalized, and the rest are set to lower-case.
     * Examples:
     *   - bob -> Bob
     *   - bOb -> Bob
     *   - BOB -> Bob
     *
     * @param toCapitalize string to properly capitalize
     * @return string with first character capitalized
     */
    private static String correctStringCapitalization(String toCapitalize) {
        return toCapitalize.substring(0, 1).toUpperCase() + toCapitalize.substring(1).toLowerCase();
    }
}
