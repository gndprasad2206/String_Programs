/*Question 2: 

You are developing a program to analyse a text message. The program should allow the user to enter a string and perform various operations on it, such as counting the number of characters, finding the occurrence of a specific word, find longest and smallest word. 

Note: if two words are having same length, print the last word of the order.  

Sample Input and Output: 

Enter a text string: Hello, how are you doing today 

Number of characters: 30 

Enter a word to find frequency: how 

Occurrences of "how": 1 

Longest word: today 

Smallest word: you */
import java.util.Scanner;
class AnalyseTextMessage{
  public void analyseTextMessage(String text,String key){
    int length=text.length(),count=0;
    String longest="",smallest="";
    String words[]=text.split(" ");
    for(int i=0;i<words.length;i++){
      if(words[i].equals(key))
        count++;
    }
    int longWord=words[0].length();
    for(int i=0;i<words.length;i++){
      if(words[i].length()>=longWord){
        longWord=words[i].length();
        longest=words[i];
      }
    }
    int smallWord=words[0].length();
    for(int i=0;i<words.length;i++){
      if(words[i].length()<=smallWord){
        smallWord=words[i].length();
        smallest=words[i];
    }
  }
    System.out.println("Number of characters: "+length);
    System.out.println("Occurrences of "+key+": "+count);
    System.out.println("Longest word: "+longest);
    System.out.println("Smallest word: "+smallest);
}
}
public class AnalyseTextMessageMain{
  public static void main(String[] args){
    String text,keyWord;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a text string");
    text=sc.nextLine();
    System.out.println("Enter a word to find frequency");
    keyWord=sc.nextLine();
    AnalyseTextMessage call=new AnalyseTextMessage();
    call.analyseTextMessage(text,keyWord);
  }
}