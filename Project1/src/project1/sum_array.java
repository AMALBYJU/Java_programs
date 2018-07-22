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
public class sum_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<5;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum is " + sum);
    }
    
}
