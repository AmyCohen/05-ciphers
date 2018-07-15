package Ciphers;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CaesarShiftCipher extends Cipher{
        public static String REPLACEMENT_ALPHABET = "";

    public String encode() {
        System.out.print("Enter the text you would like to encode: ");
        Scanner encodingInput = new Scanner(System.in);
        String payload = encodingInput.nextLine();

        System.out.print("What number would you like your text shifted by: ");
        Scanner shiftingLetters = new Scanner(System.in);
        int shiftedAmount = parseInt(shiftingLetters.nextLine());

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);

        REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode() {
        System.out.print("Enter the text you would like decoded: ");
        Scanner decodingInput = new Scanner(System.in);
        String payload = decodingInput.nextLine();

        System.out.print("What number would you like your text shifted by: ");
        Scanner shiftingLetters = new Scanner(System.in);
        int shiftedAmount = parseInt(shiftingLetters.nextLine());

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);

        REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        return replaceCharacters(payload,REPLACEMENT_ALPHABET,ALPHABET);
    }
}
