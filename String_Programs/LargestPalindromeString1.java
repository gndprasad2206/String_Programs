import java.util.Scanner;
import java.lang.StringBuffer;

class Palindrome1{
  public void largestPalindromeString(String str){
    String largestPalindrome="";
    int max=0;
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        String checkString=str.substring(i, j);
        if(isPalindrome(checkString)&&max<checkString.length()){
          largestPalindrome=checkString;
          max=checkString.length();
        }
      }
    }
    System.out.println("Largest Palindrome Word Is: "+largestPalindrome);
  }
  public static boolean isPalindrome(String str){
    String str1=str;
    StringBuffer bstr=new StringBuffer(str);
    bstr.reverse();
    String str2=bstr.toString();
    return str1.equals(str2);
  }
}
  

public class LargestPalindromeString1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    Palindrome1 p=new Palindrome1();
    p.largestPalindromeString(str);
  }
}