/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import java.util.Scanner;

public class rect {
    private int length;
    private int breadth;
    public void getinfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        length = sc.nextInt();
        System.out.println("Enter breadth ");
        breadth = sc.nextInt();        
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public int area()
    {
        return length*breadth;
    }
}
