/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem7 {
    
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int num = sc.nextInt();
        
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
            
        }
    }
}
