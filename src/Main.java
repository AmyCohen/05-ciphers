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
        String plainText = "i am starting to be very frustrated";
        cipherRequest(plainText);

    }


    /*
    Write a function that uses operation and cipherSelection to appropriately interact with the user's selections.
     */

    public static void cipherRequest (String payload) {

        ROT13Cipher rot13 = new ROT13Cipher();
        operation();
        cipherSelection();

        if (operation() == "1") {
            if (cipherSelection() == "2") {
                rot13.encode(payload);
            } else if (cipherSelection() == "2") {
                rot13.decode(payload);
            }

        }
    }

    //This should be a helper function that returns the choice.
    public static String operation () {
        Scanner input = new Scanner(System.in);
        System.out.println("Select your operation\n" +
                "1: encode\n" +
                "2: decode");
        System.out.print("Your choice: ");
        String selection = input.nextLine();
        System.out.println();
//
//        Boolean whileRunning = true;
//
//        while (whileRunning) {
//            cipherSelection();
//            whileRunning = false;
//        }
        return selection;
    }

    //This should be a helper function that returns the choice.
    public static String cipherSelection () {
        Scanner input = new Scanner(System.in);
        System.out.println("Select your cipher\n" +
                "1: Plain Text Cipher\n" +
                "2: ROT13 Cipher\n" +
                "3: Caesar Shift Cipher\n" +
                "4: Keyword Cipher");
        System.out.print("Your choice: ");
        String selection = input.nextLine();
        System.out.println();


//        Boolean whileRunning = true;

//        while (whileRunning) {
//            if (selection.equals("1")) {
//                //plain text cipher
//            } else if (selection.equals("2")) {
//                //ROT 13
//            } else if (selection.equals("3")) {
//                //Caesar Shift
//            } else if (selection.equals("4")) {
//                //Keyword
//            }
//            whileRunning = false;
        return selection;
        }


}
