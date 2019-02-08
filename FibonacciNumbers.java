import java.util.Scanner;
import java.util.Arrays;

public class FibonacciNumbers {  
  
  public static class GlobalVars {
    public static int counter = 0; //счетчик отработок функции
    public static int CONST_NUMBER; // для сравнения с заданным числом при выводе массива
  }
  
  
  public static void main(String[] args) { 
    
        int num = writeNumber();
        //массив для запоминания значений
        int[] memory = new int[num+1];
        Arrays.fill(memory, -1);         
              
        findFibonachi(num, memory);
        printFibonachi (memory); 
        
 
}
  public static int writeNumber() {
  
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        GlobalVars.CONST_NUMBER = num;
        in.close();
        if (num < 0)
          num = Math.abs(num);
        return num;
        
  
  }  
  
public static int findFibonachi(int n, int[] memory){
   
     if ((n == 0) || (n == 1)) {  
      memory[n] = n;
      GlobalVars.counter++;      
      return n;
               
    }    
    if (memory[n] == -1) 
        memory[n] = findFibonachi(n - 1, memory) + findFibonachi(n - 2, memory);
    
     GlobalVars.counter++;
     return memory[n]; 
  
}

public static void printFibonachi (int[] array) {
       System.out.println("Fibonacci numbers: "); 
       int finalNumber = GlobalVars.CONST_NUMBER;       
       if (finalNumber >= 0) {
         for (int i = 0; i < array.length; i++)       
           if (array[i] < finalNumber && array[i] >= 0)           
             System.out.print(array[i] + " ");                  
       
       } else {
         finalNumber = Math.abs(finalNumber);
         for (int i = 0; i < array.length; i++)       
           if (array[i] < finalNumber && array[i] >= 0) {
              int negativeNumber = -(array[i]);
              System.out.print(negativeNumber + " "); 
         }          
                     
       }

       System.out.println("counter " + GlobalVars.counter ); 
}


  
  
}
