package com.phone_dailer_combination;
import java.util.InputMismatchException;
import java.util.Scanner;

final class Main {
    /**
     * for taking input.
     * @param args for taking input from command line.
     */
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the number (between 2 - 9 ) "
                    + "combination: ");
            final int numberOfPhoneKeyPad = scanner.nextInt();
            LetterCombination letterCombinationObject
                    = new LetterCombination();
            letterCombinationObject.letterCombinations(
                    String.valueOf(numberOfPhoneKeyPad),
                    String.valueOf(numberOfPhoneKeyPad).length());
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input, Enter Interger only.");
        } catch (Exception exception) {
            System.out.println("Exception ocurr: " + exception);
        }
    }
    private Main() {
        // for remove Utility classes should not have
        // a public or default constructor.
        // (3:1) [HideUtilityClassConstructor]
    }
}
