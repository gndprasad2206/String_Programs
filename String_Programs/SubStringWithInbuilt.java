/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {
  public static void main(String[] args){//main method
    String str,key;//declare variables
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    str=sc.nextLine();//take input from user
    System.out.println("Ente the key value to search");
    key=sc.nextLine();
    String words[]=str.split(" ");
    int c=0;
    for(int i=0;i<words.length;i++){
      if(words[i].equals(key)){//check if the string contains substring or not if contains print found else print not found
        System.out.println(key+" is found");
        c++;
        break;
      }
    }
    if(c==0){
      System.out.println(key+" is not found");
    }
  }
}