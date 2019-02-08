import java.util.Scanner;

public class PrimeNumbers {
  
  
  public static void main(String[] args) { 
    
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        in.close();
        
        findPrimeNumbers(num);
    
  }
  
  
   static void findPrimeNumbers(int lastNumber){
     
     if (lastNumber > 1) {
       System.out.println("Prime Numbers:");   
       
       for (int i = 2; i<=lastNumber;  i++ ) {         
               
         if (i == 2){           
           System.out.print(i+", ");           
         } else {           
           boolean flag = true;
           for (int x = 2; x<i;  x++ )
             if (i%x == 0) flag = false;           
           if (flag) System.out.print(i + ", ");           
         }
         
       }
     } else if (lastNumber < 0) {
       System.out.println("Negative number cannot be a Prime number");
     } else {
       System.out.println("Prime numbers were not found");
     }      
   }
     
     
}
   

  
