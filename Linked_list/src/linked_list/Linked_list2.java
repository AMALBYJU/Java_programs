
package linked_list;
import java.util.Scanner;
/*
class node
{
    int data;    // Data of linked list
    node next;   // Link to next node
    
    public node(int ele)   // Constructor for node class
    {
        data = ele;
    }
    
    void display()
    {
        System.out.println(data + " ");
    }   

}
*/

class linkoperation2
{
    node first;  // Head node
    
    public linkoperation2()  // I*ntitialising the first pointer to NULL
    {
        first = null;
    }
    
    public void insertNode(int ele,int pos)
    {
        node cursor;  //Points to the node before ther node to be deleted 
        node newnode = new node(ele);
        
        if(first == null)
        {
            newnode.next = first;
            first = newnode;
        }
        else
        {
            cursor = first;
            int counter = pos;
            while(cursor.next != null && counter != 2)
            {
                cursor = cursor.next;
                --counter; 
            }
            
            newnode.next = cursor.next;
            cursor.next = newnode;
        } 
    }
    
    public void deleteNode(int ele)
    {
        node cursor;  //Points to the node before ther node to be deleted 
       
        if(first == null)
        {
            System.out.println("List is empty");
        }
        else if(first.data == ele)
        {
            first = first.next;
        }
        else
        {
            cursor = first;
            while(cursor.next != null && cursor.next.data != ele)
            {
                cursor = cursor.next;
            }
            if(cursor.next == null)
            {
                System.out.println("Element is not to be found");
            }
            else
            {
                node temp = cursor.next; // Node to be deleted
                cursor.next = cursor.next.next;
                System.out.println("Deleted: " + temp.data); // Showing details of deleted node
            }
        }
    }
    
    public void displayList()
    {
        node cursor = first;  //Points to the node before ther node to be deleted 
       
        if(first == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(cursor != null)
            {
                cursor.display();
                cursor = cursor.next;
            }
            System.out.println(); 
        }
    }
    
    public void searchNode(int ele)   //To search  a node
    {
        node cursor;  //Points to the node before the node to be deleted 
       
        if(first == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            int counter = 1;
            cursor = first;
            while(cursor != null)   // Traversing the list to search for element
            {
               if(cursor.data == ele)
               {
                   System.out.println("Element is found at " + counter);
                   return;
               }
               cursor = cursor.next;
               counter++;
            }
            System.out.println("Element is not to be found");
        }
    }
   
    public boolean isEmpty()
    {
        return (first == null);
    }
}
public class Linked_list2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkoperation2 l = new linkoperation2();
        System.out.println("MENU");  
        System.out.println("1. Insert\n2. Delete\n3. Display\n4. Search");
        int choice;  // Choosing the menu choice
        char ch;     // Choosing whether to continue
        int ele;     // Element
        int pos;     //Position 
        do
        {
            System.out.print("\nEnter your choice ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter element to insert and position ");
                       ele = sc.nextInt();
                       pos = sc.nextInt();
                       l.insertNode(ele, pos);
                       break;
                case 2:System.out.println("Enter the element that is to be deleted ");
                       ele = sc.nextInt();
                       l.deleteNode(ele);
                       break;
                case 3:l.displayList();
                       break;
                case 4:System.out.println("Enter the node that is to be searched ");
                       ele = sc.nextInt();
                       l.searchNode(ele);
                       break;
                default:System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? (Y/N) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y'||ch == 'Y');
    }
    
}
