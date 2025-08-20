/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basiccontrolstructurepart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Input Number: ");
        int num = sc.nextInt();
            if (num > 0) {
                System.out.println(num + " Is Positive");
            } else if (num < 0) {
                System.out.println(num + " Is Negative");
            }
        }
}     
        

    

