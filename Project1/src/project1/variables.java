/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
//import the Scanner class
import java.util.Scanner;


public class variables {
    public static void main(String[] args) {
      //create object for Scanner
      Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter a value");
        short b=sc.nextShort();
        System.out.println("enter a value");
        byte c=sc.nextByte();
        System.out.println("enter a value");
        long d=sc.nextLong();
        System.out.println("Enter a value");
        float e=sc.nextFloat();
        System.out.println("Enter a value");
        double f=sc.nextDouble();
        System.out.println("Enter boolean value");
        boolean g=sc.nextBoolean();
        System.out.println("Enter a string");
        String str=sc.next();
        System.out.println("Enter a character");
        char s=sc.next().charAt(0);      
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
              
        System.out.println(str);
    }    
}
