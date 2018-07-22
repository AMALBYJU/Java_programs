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
public class sortarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[]{3,1,2,4,5};
        // Bubble sort
      // String[] array={"Arun","Maya","Kevin","Betty"} ;
        int i,j;
       
        for(i=0;i<array.length-1;i++)
        {
            for(j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
       
        //Insertion sort
//        for(i=1;i<array.length;i++)
//        {
//            String T = array[i];
//            for(j=i-1;j>=0;j--)
//            {
//                if(array[j] > T)
//                    break;
//                else
//                    array[j+1] = array[j];
//                    
//            }
//            array[j+1] = T;
//        }
       
        //Print sorted array
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
