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
public class arr_reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        
        // Reversing the array
        for(int i=0;i<arr.length/2;i++)
        {
            int c = arr[i];
            arr[i] = arr[5-i-1];
            arr[5-i-1] = c;
        }        
        // Printing the result
//        for(int i=0;i<5;i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
        
        for(int i:arr)
        {
            System.out.println(i);
        }
        
    }
    
}
