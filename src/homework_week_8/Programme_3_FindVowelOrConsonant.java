package homework_week_8;

import java.util.Locale;
import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {

    public static void checkVowel10rConsonant(String letter) {
        //Checks length of string
        //if user enters more then 1 character an error message is printed
        if (letter.length() > 1) {
            System.out.println("Error. not a single character");
            //if user enters a symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u")) {
            System.out.println("Input letter is a vowel");
        } else {
            System.out.println("Input letter is a consonant");
        }
    }

    //This method will check is it a letter or not?
    public static boolean isItALetter(String l) {
        return l.charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) {
        //Scanner declartion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");
        String str = scanner.next().toLowerCase(Locale.ROOT);
        //Calling static method directly
        checkVowel10rConsonant(str);
        //closing the scanner object
        scanner.close();
    }
        }

