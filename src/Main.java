import Ciphers.CaesarShiftCipher;
import Ciphers.KeywordCipher;
import Ciphers.ROT13Cipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cipherRequest();
    }

    public static void cipherRequest() {
        ROT13Cipher rot13Cipher = new ROT13Cipher();
        CaesarShiftCipher caesarShift = new CaesarShiftCipher();
        KeywordCipher keywordShift = new KeywordCipher();

        String operationAnswer = operation();
        String cipherAnswer = cipherSelection();

        Boolean whileRunning = true;

        while (whileRunning) {
            if (cipherAnswer.equals("1")) {
                System.out.println("You have selected the ROT13 Cipher");
                if (operationAnswer.equals("1")) {
                    rot13Cipher.encode();
                } else if (operationAnswer.equals("2")){
                    rot13Cipher.decode();
                }

            } else if (cipherAnswer.equals("2")) {
                System.out.println("You have selected the Caesar Shift Cipher");
                if (operationAnswer.equals("1")) {
                    caesarShift.encode();
                } else if (operationAnswer.equals("2")) {
                    caesarShift.decode();
                }

            } else if (cipherAnswer.equals("3")) {
                System.out.println("You have selected the keyword Cipher");
                if (operationAnswer.equals("1")) {
                    keywordShift.encode();
                } else if (operationAnswer.equals("2")) {
                    keywordShift.decode();
                }

            } else {
                System.out.println("That is an incorrect selection.");
            }
            whileRunning = false;
        }
        System.out.println();
    }

    private static String operation() {

        Scanner input = new Scanner(System.in);
        System.out.println("Select your operation\n" +
                "1: encode\n" +
                "2: decode");
        System.out.print("Your choice: ");
        String operationSelection = input.nextLine();
        System.out.println();

        Boolean isRunning = true;
        while (isRunning) {
            if (operationSelection.equals("1")) {
                System.out.println("You have selected to encode.");
            } else if (operationSelection.equals("2")) {
                System.out.println("You have selected to decode.");
            } else {
                System.out.println("That is in incorrect selection.");
            }
        isRunning = false;
        }
        System.out.println();
        return operationSelection;
    }

    private static String cipherSelection() {
        Scanner cipherInput = new Scanner(System.in);
        System.out.println("Select your cipher\n" +
                "1: ROT13 Cipher\n" +
                "2: Caesar Shift Cipher\n" +
                "3: Keyword Cipher");
        System.out.print("Your choice: ");
        String cipherSelected = cipherInput.nextLine();
        System.out.println();

        return cipherSelected;
    }
}