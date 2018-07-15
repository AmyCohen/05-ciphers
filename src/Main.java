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
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String selection = input.nextLine();
        return selection;
    }

    //This should be a helper function that returns the choice.
    private static String operation() {
        cipherRequest();

        Scanner input = new Scanner(System.in);
        System.out.println("Select your operation\n" +
                "1: encode\n" +
                "2: decode");
        System.out.print("Your choice: ");
        String operationSelection = input.nextLine();
        System.out.println();

        if (operationSelection == "1") {
            System.out.println("You have selected to encode.");
        } else if (operationSelection == "2") {
            System.out.println("You have selected to decode.");
        } else {
            System.out.println("That is in incorrect selection.");
        }
        return operationSelection;
    }

    //This should be a helper function that returns the choice.
    private static String cipherSelection() {
        ROT13Cipher rot13Cipher = new ROT13Cipher();

        Scanner input = new Scanner(System.in);
        System.out.println("Select your cipher\n" +
                "1: Plain Text Cipher\n" +
                "2: ROT13 Cipher\n" +
                "3: Caesar Shift Cipher\n" +
                "4: Keyword Cipher");
        System.out.print("Your choice: ");
        String cipherSelected = input.nextLine();
        System.out.println();


        Boolean whileRunning = true;

        while (whileRunning) {
            if (cipherSelected.equals("1")) {
                System.out.println("You have selected the Plain Text Cipher");
            } else if (cipherSelected.equals("2")) {
                System.out.println("You have selected the ROT13 Cipher");
                if (operation() == "1") {
                    rot13Cipher.encode(cipherRequest());
                } else {
                    rot13Cipher.decode(cipherRequest());
                }
            } else if (cipherSelected.equals("3")) {
                System.out.println("You have selected the Caesar Shift Cipher");
            } else if (cipherSelected.equals("4")) {
                System.out.println("You have selected the keyword Cipher");
            } else {
                System.out.println("That is an incorrect selection.");
            }
            whileRunning = false;
        }
            return cipherSelected;
    }
}


