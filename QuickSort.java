/**
 * Auto Generated Java Class.
 */
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
 

    public static void main(String[] args) {
        int[] x = writeArray ();
         
        int start = 0;
        int end = x.length - 1;
 
        quickSort(x, start, end);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(x));
    }
    
    
  public static int[] writeArray () {
    int numberElements; 
    do {
    System.out.print("How many numbers will be in the array?"); 
   
    numberElements = writeNumber(); 
    if (numberElements <= 0) 
      System.out.println("The number of elements must be greater than 0");   
    
    } while (numberElements <= 0);    
   
    int[] array = new  int[numberElements];
    
    for (int i = 0;  i < array.length; i++) {
      int count = i + 1;
      System.out.print("Enter " + count + " element");   
      array[i] = writeNumber ();
    }
    
    return array;      
  }
  public static int writeNumber () {    
    
    Scanner in = new Scanner(System.in);        
    int number = in.nextInt();
    in.close();
    return number;
    
  } 
    
   public static void quickSort(int[] array, int firstPos, int lastPos) {
        if (array.length == 0 || firstPos >= lastPos)
            return;  
        
        int middlePos = firstPos + (lastPos - firstPos) / 2;               
        int i = firstPos, j = lastPos;
        while (i <= j) {
            while (array[i] > array[middlePos]) 
                i++;           
 
            while (array[j] < array[middlePos]) 
                j--;           
 
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
 
      
        if (firstPos < j)
            quickSort(array, firstPos, j);
 
        if (lastPos > i)
            quickSort(array, i, lastPos);
    }
}
