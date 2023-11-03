//WAP to print all ASCII character with their values.
import java.util.Scanner;
public class All_Ascii_Vales_Main{
public static void main (String[] args){
  Scanner sc=new Scanner(System.in);
  char ch='a';
  for(int i='a';i<='z';i++,ch++)
    {
    
  System.out.println("for the character " +ch+ " the ascii value is "+i);
    }
}
}
