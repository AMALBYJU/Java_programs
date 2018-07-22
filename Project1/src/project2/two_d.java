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
public class two_d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] arr=new int[3][2];
       
       int[][] brr={{1,2,3},{11,22},{12,23,34}};
       
       int[][] crr=new int[][]{
           new int[]{1,2,3,4},
           new int[]{2,3,4,5}    
       };
       
       for(int i=0;i<brr.length;i++)       
       {
           for(int j=0;j<brr[i].length;j++)
           {
               System.out.print(brr[i][j]+"\t");
           }
           System.out.println("");
       }
       
       for(int[] i:crr)
       {
           for(int j:i)
           {
               System.out.print(j+"\t");
           }
           System.out.println("");
       }
    }
    
}
