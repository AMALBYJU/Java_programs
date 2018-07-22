/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author aptech
 */
public class exception_eg2 {    
    public static void main(String[] args) {
        int num=10;
        try
        {
        System.out.println(num/0);        
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
        int[] arr=new int[2];
        try
        {
        System.out.println(arr[2]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        String str=null;
        try
        {
        System.out.println(str.charAt(0));
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        String num2="123j";
        try
        {
        System.out.println(Integer.parseInt(num2)+2);
        }catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        
                
        System.out.println("The End");       
    }    
}
