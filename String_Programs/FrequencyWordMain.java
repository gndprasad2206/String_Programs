/*Question 7: 

Scenario: You are given a string that represents a sentence. Your task is to find the most frequently occurring word in the sentence. If there are multiple words with the same highest frequency, choose the word that appears first in the sentence. 

Sample Input: 

 String sentence = "the cat and the dog jumped over the fence and ran away"; 

 Sample Output: 

 The most frequent word is: the */
import java.util.Scanner;
class FrequencyWord{
  public void frequency(String sentence){
    String frequentWord="";
    String words[]=sentence.split(" ");
    boolean visiter[]=new boolean[words.length];
    int dup=0;
    for(int i=0;i<words.length;i++){
      if(visiter[i]==true){
        continue;
      }
      int count=1;
      for(int j=1+i;j<words.length;j++){
        boolean b=words[i].equals(words[j]);
        if(b){
          count++;
          visiter[j]=true;
        }
      }
        if(count>dup){
          frequentWord=words[i];
          dup=count;
        }
    }
    System.out.println("The most frequent word is: "+frequentWord);
  }
}
    


public class FrequencyWordMain{
  public static void main(String[] args){
    String sentence;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sentence");
    sentence=sc.nextLine();
    FrequencyWord call=new FrequencyWord();
    call.frequency(sentence);
  }
}