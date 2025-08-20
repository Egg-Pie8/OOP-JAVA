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
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input A Year: ");
        int year = sc.nextInt(); 
        
    if (( year % 400 == 0 )|| (year % 4 == 0 && year % 100 !=0)) {
        System.out.println(year + " Is A Leap Year");
        
    }else{
        System.out.println(year + " Is A Not Leap Year");
}
}
}