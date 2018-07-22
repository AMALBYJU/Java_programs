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
public class Item {
    int item_id;
    String item_name;
    float item_price;
    
    Item()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Item Id");
        item_id=sc.nextInt();
        System.out.println("Enter Item Name");
        item_name=sc.next();
        System.out.println("Enter Item Price");
        item_price=sc.nextFloat();
    }    
    Item(int i,String n,float p)
    {
        item_id=i;
        item_name=n;
        item_price=p;
    }
    void display()
    {
        System.out.println("Item Id="+item_id);
        System.out.println("Item Name="+item_name);
        System.out.println("Item Price="+item_price);
    }
}
