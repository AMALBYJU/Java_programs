/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author aptech
 */
public class two_d_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //Row sum
        for(int[] i:array)
        {
            int sum = 0;
            for(int j:i)
            {
                sum += j;
            }
            System.out.print(sum+ " ");
        }
        System.out.println();
        //Column sum
        for(int j = 0;j<array[0].length;j++)
        {
            int sum = 0;
            for(int i = 0;i<array.length;i++)
            {
                sum += array[i][j];
            }
            System.out.print(sum+ " ");
        }        
    }
    
}
