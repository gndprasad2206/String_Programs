/*Q1) As a secret agent, you need to send and receive classified messages securely. You've 
received a message "HELLO" from Agent Y that needs encryption. Using your Java program with 
a key of 3, you encrypt the message to "KHOOR." This secure encryption ensures your 
communications are safe from prying eyes during transmission. Agent Y can decrypt it with the 
same key on the other end.
Your program should provide the following functionality:
Accept an input string message from the user.
Accept an encryption key (an integer) from the user.
Encrypt the message by shifting each character in the message by the key positions.
Output the encrypted message.
Expected Input:
- Enter the message to encrypt: "HELLO"
- Enter the encryption key (an integer): 3
Expected Output:
- Encrypted Message: "KHOOR"*/

import java.util.Scanner;

class Encryption {
  public void encryption(String str, int n) {
    String en = "";
    int range = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      range = n + (int) ch;
      if (range >= 'a' && range <= 'z') {
        en = en + (char) (ch + n);
      } else {
        range = range - 122;
        range = range + 96;
        en = en + (char) range;
      }
    }
    System.out.println("The encryption code of given String is " + en);

  }
}

public class EncryptionCode {
  public static void main(String[] args) {
    String str;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    str = sc.nextLine();
    System.out.println("Enter the intiger");
    n = sc.nextInt();
    Encryption call = new Encryption();
    call.encryption(str, n);
  }
}