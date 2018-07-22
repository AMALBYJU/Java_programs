/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

public class area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float length;
        float breadth;
        float area;
        float peri;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        length = sc.nextFloat();
        System.out.println("Enter breadth ");
        breadth = sc.nextFloat();
        area = length*breadth;
        peri = 2*(length+breadth);
        System.out.println("Perimeter = "+peri);
        System.out.println("Area = "+area);
    }
    
}
