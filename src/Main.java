import java.sql.SQLOutput;
import java.util.Scanner;
import Ciphers.Cipher;
import Ciphers.ROT13Cipher;
import Ciphers.CaesarShiftCipher;
import Ciphers.KeywordCipher;

public class Main {
    public static void main(String[] args) {

        operation();
        cipherSelection();

        /*
        Select your operation
        1: encode
        2: decode
        Your choice: 1

        Select your cipher
        1: Plain Text Cipher
        2: ROT13 Cipher
        3: Caesar Shift Cipher
        4: Keyword Cipher
        Your choice: 1

        You're encoding with the Plain Text Cipher.

         plaintext: hello
        ciphertext: hello
         */
    }


    /*
    Should operation and selection be combined to allow for an if 1 and if 1 then run plain text cipher type of logic? if not then what is actually happening when a selection is made? Which cipher does it not to use for encoding. Create logic to support the users choice.
     */
    public static void operation () {
        Scanner input = new Scanner(System.in);
        System.out.println("Select your operation\n" +
                "1: encode\n" +
                "2: decode");
        System.out.print("Your choice: ");
        String selection = input.nextLine();
        System.out.println();

        Boolean whileRunning = true;

        while (whileRunning) {
            if (selection.equals("1")) {
                //encode
            }else if (selection.equals("2")) {
                //decode
            }
            whileRunning = false;
        }
    }

    public static void cipherSelection () {
        Scanner input = new Scanner(System.in);
        System.out.println("Select your cipher\n" +
                "1: Plain Text Cipher\n" +
                "2: ROT13 Cipher\n" +
                "3: Caesar Shift Cipher\n" +
                "4: Keyword Cipher");
        System.out.print("Your choice: ");
        String selection = input.nextLine();
        System.out.println();


        Boolean whileRunning = true;

        while (whileRunning) {
            if (selection.equals("1")) {
                //plain text cipher
            } else if (selection.equals("2")) {
                //ROT 13
            } else if (selection.equals("3")) {
                //Caesar Shift
            } else if (selection.equals("4")) {
                //Keyword
            }
            whileRunning = false;
        }


    }

}
