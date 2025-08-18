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
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First Number: ");
         int firstnum = sc.nextInt();
         System.out.print("Input Second Number: ");
         int secondnum = sc.nextInt();
         
         int product = firstnum * secondnum;
         System.out.println(firstnum + " * " + secondnum + " = "  + product);
    }
}
