package Ciphers;

public class CaesarShiftCipher extends Cipher{
    private int shiftedAmount;
    public static String REPLACEMENT_ALPHABET = "";

    public CaesarShiftCipher (int shiftedAmount) {
        this.shiftedAmount = shiftedAmount;
    }

    public String encode(String payload) {
        System.out.println(); //added space for greater readability in the console

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);

        REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        System.out.println(" Standard: " + ALPHABET);
        System.out.println("Encrypted: " + REPLACEMENT_ALPHABET);

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode(String payload) {

        String abcPart1 = ALPHABET.substring(shiftedAmount);
        String abcPart2 = ALPHABET.substring(0, shiftedAmount);

        REPLACEMENT_ALPHABET = abcPart1 + abcPart2;

        System.out.println("Standard:  " + ALPHABET);
        System.out.println("Encrypted: " + REPLACEMENT_ALPHABET);
        System.out.println();

        return replaceCharacters(payload,REPLACEMENT_ALPHABET,ALPHABET);
    }
}
