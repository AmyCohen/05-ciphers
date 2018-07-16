package Ciphers;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CaesarShiftCipher extends Cipher{
        public static String REPLACEMENT_ALPHABET = "";

    public String encode() {
        System.out.println(); //added space for greater readability in the console
        System.out.print("Enter the text you would like to encode: ");
        Scanner encodingInput = new Scanner(System.in);
        String payload = encodingInput.nextLine();
        System.out.println(); //added space for greater readability in the console

        System.out.print("Enter shift amount [0-25]: ");
        Scanner shiftingLetters = new Scanner(System.in);
        int shiftedAmount = parseInt(shiftingLetters.nextLine());
        System.out.println(); //added space for greater readability in the console

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);

        REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        System.out.println(" Standard: " + ALPHABET);
        System.out.println("Encrypted: " + REPLACEMENT_ALPHABET);

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode() {
        System.out.println(); //added space for greater readability in the console
        System.out.print("Enter the text you would like decoded: ");
        Scanner decodingInput = new Scanner(System.in);
        String payload = decodingInput.nextLine();
        System.out.println(); //added space for greater readability in the console

        System.out.print("What number would you like your text shifted by: ");
        Scanner shiftingLetters = new Scanner(System.in);
        int shiftedAmount = parseInt(shiftingLetters.nextLine());
        System.out.println(); //added space for greater readability in the console

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);

        REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        System.out.println("Standard:  " + ALPHABET);
        System.out.println("Encrypted: " + REPLACEMENT_ALPHABET);
        System.out.println();

        return replaceCharacters(payload,REPLACEMENT_ALPHABET,ALPHABET);
    }
}
