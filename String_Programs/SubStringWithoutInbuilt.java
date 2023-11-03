/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {
  public static void main(String[] args){//main method
    String str,key;//declare variables
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();//take input from user
    System.out.println("Enter the key String to Search");
    key=sc.nextLine();
    int c=0;
    //compare two strings if the search string found or not without using inbuilt method isSubString()
    String words[]=str.split(" ");
    for(int i=0;i<words.length;i++){
      if(key.equals(words[i])){
        c++;
        System.out.println(key+" is founs");
        break;
      }
    }
    if(c==0){
      System.out.println(key+" Not found");
    }
  }
//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false

}