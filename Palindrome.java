import java.util.Scanner;

public class Palindrome {
  
  
  public static void main(String[] args) { 
    
   char[] myWord = writeWord ();
   checkForPalindrome (myWord);  
   
  }
  
  public static char[] writeWord () {
    
    Scanner in = new Scanner (System.in);
    System.out.print("Input a word: ");
    String word = in.next(); 
    int countLetters = word.length();
    in.close();  
    
    char[] letters = new char[countLetters];
    for (int i = 0; i < letters.length; i++)
      letters[i] = word.charAt(i);
    
    return letters;
  }
  
  public static void checkForPalindrome (char[] array) {
    // проверка на кол-во символов
    if (array.length < 2) {
      System.out.print("The number of letters must be more than 2");
    } else {      
   
      // посимвольная проверка
      int middle = array.length / 2;      
      boolean compliance = true;
      
      //четное/ нечетное кол-во символов
      if (array.length % 2 == 0) {
        for(int i = 0, j = array.length - 1; i < middle && j >= middle; i++, j--) {
          compliance = compareItems(array[i], array[j]); 
          if (!compliance)
            break;      
        }      
      } else {
        for(int i = 0, j = array.length - 1; i < middle && j > middle; i++, j--) {
          compliance = compareItems(array[i], array[j]); 
          if (!compliance)
            break;      
        }
      }

      if (compliance) {
        System.out.print("The word is a palindrome" );    
      } else{
        System.out.print("The word is not a palindrome" ); 
      }
      
    
    }
    

  }
  
  public static boolean compareItems(char firstItem, char lastItem) {
    boolean flag = true;
    if (firstItem != lastItem) 
      flag = false;
      
    return flag;    
  }
  
  
}
