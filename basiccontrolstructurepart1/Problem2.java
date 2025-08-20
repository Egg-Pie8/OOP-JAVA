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
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number: ");
        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " Is Divisible By 3");
        } else {
            System.out.println(num + " Is Not Divisible By 3");
    }
}
}
