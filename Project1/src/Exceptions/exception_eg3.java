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
public class exception_eg3 {

    public static void main(String[] args) {
        int num = 10;
        try {
            System.out.println(num / 0);

            int[] arr = new int[2];
            System.out.println(arr[2]);

            try {
                String str = null;
                System.out.println(str.charAt(0));
            } catch (NullPointerException e) {
                System.out.println(e);
            }

            String num2 = "123j";
            System.out.println(Integer.parseInt(num2) + 2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("The End");
    }
}
