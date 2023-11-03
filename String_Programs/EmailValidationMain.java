
/*Question 5: 

You are developing a program to analyse and manipulate email addresses. The program should allow the user to enter an email address and perform various operations such as checking if the email address is valid, extracting the username and domain, and generating a masked email address. 

Note:  

   1. Email id does not starts with special characters and does not allow white spaces between characters. 

    2. Email id should end with domain and should contains ‘@’ symbol.  

Input: 

String email = "example@email.com"; 

Output: 

Is the email address valid? true 

Username: example 

Domain: email.com 

Masked Email: e******@email.com 
*/
import java.util.Scanner;

class EmailValidation {
    public void isemailValid(String email) {
        String username = "", domain = "", maskedMail = "";
        int index = email.indexOf(" ");
        int index1 = email.indexOf("@");
        if (index == -1) {
            for (int i = 0; i < index1; i++) {
                username = username + email.charAt(i);
            }
            for (int i = index1 + 1; i < email.length(); i++) {
                domain = domain + email.charAt(i);
            }
            for (int i = 0; i < email.length(); i++) {
                if (i == 0 || i >= index1) {
                    maskedMail = maskedMail + email.charAt(i);
                } else {
                    maskedMail = maskedMail + "*";
                }
            }
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
            System.out.println("Masked Email: " + maskedMail);
        } else {
            System.out.println("is the email is not valid");
        }

    }
}

public class EmailValidationMain {
    public static void main(String[] args) {
        String email;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email");
        email = sc.nextLine();
        EmailValidation call = new EmailValidation();
        call.isemailValid(email);

    }
}