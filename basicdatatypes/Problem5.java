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
public class Problem5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distanceMeters  = sc.nextDouble();
        
        System.out.print("Input hour: ");
        int hours  = sc.nextInt();
        
        System.out.print("Input minutes: ");
        int minutes  = sc.nextInt();
        
        System.out.print("Input seconds: ");
        int seconds  = sc.nextInt();
        
        int totalSeconds = (hours * 3600)+ (minutes * 60) + seconds;
        double kilometersPerHour = distanceMeters / totalSeconds;
        
        double speedKmh = speedMps * 3.6;
        double speedKmh = speedMps * 0.621371;
        
        double speedMetersPerMinute = distanceMeters  / ((hours * 60) + minutes + (seconds / 60.0));
        double
        
    }
}
