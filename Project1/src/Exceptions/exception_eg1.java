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
public class exception_eg1 {    
    public static void main(String[] args) {
        int num=10;
        try
        {
        System.out.println(num/0);
        }catch(Exception e)
        {
            //System.out.println(e);
            //e.printStackTrace();
            System.out.println(e.getCause());
        }
        
//        int[] arr=new int[2];
//        try
//        {
//        System.out.println(arr[2]);
//        }catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        
        
        System.out.println("The End");       
    }    
}