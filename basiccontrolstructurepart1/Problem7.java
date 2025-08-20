/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiccontrolstructurepart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem7 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
       int sum = 0;
       
       while(true); {
    
    try{
        System.out.print("Enter Number: ");
        if (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        
        if (num == 0) {
            System.out.println("Sum: " + sum);  
        
        
        }  
        sum += num;
    
    } else {
            System.out.println(" Error: Invalid Number!");
          scanner.next();
    }
}
      scanner.close();
}
}