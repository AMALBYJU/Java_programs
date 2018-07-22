/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author aptech
 */
public class question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 2016;
        if(year % 400 == 0 || (year%100 != 0 && year % 4 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a leap year");
    }
    
}
