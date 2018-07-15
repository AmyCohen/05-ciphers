import Ciphers.CaesarShiftCipher;
import Ciphers.KeywordCipher;
import Ciphers.ROT13Cipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Add a response that tells the user what selection they have made. Cannot just say "string" + selection. Must include an if statement that checks for the selection to allow for the proper text to display.

        if (selection.equals("1") {
        System.out.println("You're encoding with the Plain Text Cipher.")

         plaintext: hello
        ciphertext: hello
         */
        cipherSelection();

    }


    /*
    Write a function that uses operation and cipherSelection to appropriately interact with the user's selections.
     */

    public static String cipherRequest() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your text: ");
//        String selection = input.nextLine();
//        return selection;
        return "not sure what this is here for";
    }

    //This should be a helper function that returns the choice.
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

    //This should be a helper function that returns the choice.
    private static void cipherSelection() {
        ROT13Cipher rot13Cipher = new ROT13Cipher();
        CaesarShiftCipher caesarShift = new CaesarShiftCipher();
        KeywordCipher keywordShift = new KeywordCipher();

        String operationAnswer = operation();

        Scanner cipherInput = new Scanner(System.in);
        System.out.println("Select your cipher\n" +
                "1: ROT13 Cipher\n" +
                "2: Caesar Shift Cipher\n" +
                "3: Keyword Cipher");
        System.out.print("Your choice: ");
        String cipherSelected = cipherInput.nextLine();
        System.out.println();


        Boolean whileRunning = true;

        while (whileRunning) {
            if (cipherSelected.equals("1")) {
                System.out.println("You have selected the ROT13 Cipher");
                if (operationAnswer.equals("1")) {
                    rot13Cipher.encode();
                } else if (operationAnswer.equals("2")){
                    rot13Cipher.decode();
                }

            } else if (cipherSelected.equals("2")) {
                System.out.println("You have selected the Caesar Shift Cipher");
                if (operationAnswer.equals("1")) {
                    caesarShift.encode();
                } else if (operationAnswer.equals("2")) {
                    caesarShift.decode();
                }
            } else if (cipherSelected.equals("3")) {
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
}


