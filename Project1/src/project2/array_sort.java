package project2;
import java.util.Arrays;

public class array_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5}; //Array of integers
        System.out.println(Arrays.binarySearch(array,0,5,5));
        int[] copy = Arrays.copyOf(array,3);
        for(int k:copy){
            System.out.println(k+" ");
        }
        copy = Arrays.copyOf(array,5);
        System.out.println(Arrays.equals(array, copy));
        Arrays.fill(copy,0,3,2);
        for(int k:copy)
        {
            System.out.println(k+" ");
        }       
    }
    
}
