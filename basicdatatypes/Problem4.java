/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight  = sc.nextDouble();
        System.out.print("Input height in inches:  ");
        double height  = sc.nextDouble();
        
        double weightInKilograms = weight * 0.45359237;
        double heightInMeters = height * 0.0254;
        
        double BMI = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Body Mass Index is: " + BMI);
    }
}
