package project2;

public class merge_arrays {
 
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{4,5,6};
        int[] arr3 = new int[6];
        int i;
        for(i=0;i<arr1.length;i++)
        {
            arr3[i] = arr1[i];
        }
        int index = i;
        for(i = 0;i<arr2.length;i++)
        {
            arr3[i+index] = arr2[i];
        }    
        //Print the result
        for(i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]+" ");
        }
    }
    
}
