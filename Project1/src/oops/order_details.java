/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;
import java.util.Scanner;
/**
 *
 * @author aptech
 */
public class order_details {    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of items");
        int s=sc.nextInt();
        Item[] order_1=new Item[s];
        
        for(int i=0;i<order_1.length;i++)
        {
            int tempid;
            String tempname;
            float price;
            System.out.println("Enter the item id ");
            tempid = sc.nextInt();
            System.out.println("Enter item name ");
            tempname = sc.next();
            System.out.println("Enter item price ");
            price = sc.nextFloat();
            order_1[i]=new Item(tempid,tempname,price);            
        }
        //Find largest element
        int pos = Integer.MAX_VALUE;
        float min = Float.MAX_VALUE;
        for(int i = 0;i<order_1.length;i++)
        {
            if(min > order_1[i].item_price)
            {
                min = order_1[i].item_price;          //Finding the minimum price 
                pos = i;
            }
        }
        System.out.println("Order Details are");
        for(int i=0;i<order_1.length;i++)
        {
            order_1[i].display();
        }        
        System.out.println("Finding Maximum element");  // Maximum element
        System.out.println("Item id = "+order_1[pos].item_id);
        System.out.println("Item name = "+order_1[pos].item_name);
        System.out.println("Item price = "+order_1[pos].item_price);
    }
    
}
