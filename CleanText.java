import java.util.Scanner;


public class CleanText {
  
 
  
  public static void main(String[] args) { 
    
    String oldText = writeText();
    cleanText(oldText);    
    
  }
  
  public static String writeText() { 
    System.out.print("Input a text: "); 
    Scanner in = new Scanner(System.in);
    String text = in.nextLine();   
    in.close();      
    return text;
  } 
  
  public static void cleanText(String oldText) {
      
      char[] letters = new char[oldText.length()];
      StringBuilder newLine  = new StringBuilder();;
      // переписываем строку в массив чаров
      try {
         oldText.getChars(0, letters.length, letters, 0);
      } catch (Exception ex) {
         System.out.println("Возникает исключение");
      }
      // перебираем каждый чар, если не число записываем
      for (int j = 0; j < letters.length; j++ ) 
        if(!Character.isDigit(letters[j])) 
          newLine.append(letters[j]);
        
      String newText = newLine.toString();    
      System.out.println(newText);
    }   

  } 
  

  

