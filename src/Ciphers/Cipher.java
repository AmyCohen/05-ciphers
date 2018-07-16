package Ciphers;

public class Cipher {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public Cipher () {
    }

    public String encode(String payload) {
        return replaceCharacters(payload, ALPHABET, ALPHABET);
    }

    public String decode(String payload) {
        return replaceCharacters(payload, ALPHABET, ALPHABET);
    }

    protected String replaceCharacters(String payload, String source, String target) {
        int indexOfLetterSource = 0;
        String replacePayload = "";
        String replaceLetters = "";
        String currentLetter = "";
        String holdingLetter = "";

        for (int i = 0; i < payload.length(); i++) {
            if (!Character.isLetter(payload.charAt(i))) {
                replaceLetters = replacePayload + String.valueOf(payload.charAt(i));
                replacePayload = replaceLetters;
                continue;

            } else
                indexOfLetterSource = source.indexOf(payload.charAt(i));
                currentLetter = String.valueOf(target.charAt(indexOfLetterSource));
                holdingLetter = currentLetter;
                replacePayload = replaceLetters += holdingLetter;
        }
        System.out.println("   Answer: " + replacePayload);
        return replacePayload;
    }

}
