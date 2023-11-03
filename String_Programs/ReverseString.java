/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;

public class ReverseString {
  //main method
  public static void main(String[] args){
    //declare variables and take input from user
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();
    String rev1="",rev2="";
    int l=str.length();
    for(int i=l-1;i>=0;i--){
      rev1=rev1+str.charAt(i);
    }
    System.out.println("reversing entire string: "+rev1);
    String word[]=str.split(" ");
    for(int i=0;i<word.length;i++){
      for(int j=word[i].length()-1;j>=0;j--){
        rev2=rev2+word[i].charAt(j);
      }
      rev2=rev2+" ";
    }
    System.out.println("reversing each word at its place: "+rev2.trim());
  }

}