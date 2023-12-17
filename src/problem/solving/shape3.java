/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.solving;

import java.util.Scanner;

public class shape3 {

    /*
    4
   *
  ***
 *****
*******
*******
 *****
  ***
   *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
