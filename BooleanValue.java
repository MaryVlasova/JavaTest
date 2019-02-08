import java.util.Scanner;

public class BooleanValue {
  
  
  public static void main(String[] args) { 
    boolean[] myArray = writeValues();
    compareValues(myArray);
  }
  
  public static boolean[] writeValues() { 
    
        Scanner in = new Scanner(System.in);
        System.out.println("Input 4 boolean value");
        boolean[] array = new boolean[4];
        for (int i = 0; i < array.length; i++) {
         int item = i + 1; 
         System.out.print( item + " value is "); 
         array[i] = in.nextBoolean(); 
        }
              
        in.close();
        return array;
  }  
  
  public static void compareValues(boolean[] array) { 
    
    int count = 0;
    for (int i = 0; i < array.length; i++ )
      if (array[i]) count++;
    
    if(count == 2) {
      System.out.println("true");
    }  else{
      System.out.println("false");
    } 
      
  }   
  
}
