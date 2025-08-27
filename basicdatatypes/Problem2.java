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
public class Problem2 {
    public static void main(String[] args) {
        
        double inchToMeters = 0.0254;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for inches: ");
        double inch = sc.nextDouble();
        
        double meter = inch * inchToMeters;
        System.out.println(inch + " Inches Is " + meter + " Meters" );
    }
}
