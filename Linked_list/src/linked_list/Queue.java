/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

class queueoperation
{
    node front;  // Front pointer
    node rear;   // Rear pointer   
    
    public queueoperation()  // I*ntitialising the first pointer to NULL
    {
        front = null;
        rear = null;
    }
    
    public void enqueue(int ele)
    {
        node n = new node(ele);
        if(rear == null)
        {
            n.next = null;
            front = n;
            rear = n;
        }
        else
        {
            n.next = rear.next;
            rear.next = n;
            rear = n;
        }
    }
    
    public node dequeue()
    {
        if(front == null)
        {
            System.out.println("The queue is empty");
            return null;
        }
        else if(front == rear)
        {
            node temp = front;
            front = rear = null;
            return temp;
        }
        else
        {
            node temp = front;
            front = front.next;
            return temp;
        }         
    }
    
    public void displayqueue()   // Display the entire linked list
    {
        node cursor = front;  // Iterator over the list
        while(cursor != rear.next)
        {
            cursor.display();
            cursor = cursor.next;
        }
        System.out.println();   
    }
    
    public boolean isEmpty()
    {
        return (front == null);
    }
}
public class Queue {

    public static void main(String[] args) {
        int choice;
        char ch;
        int ele;
        node n;
        queueoperation q = new queueoperation();  // Creating a new stack
        Scanner sc = new Scanner(System.in);  
        System.out.println("MENU");
        System.out.println("1. Enqueue\n2. Dequeue\n3. Display");
        do
        {
            System.out.print("Enter your choice ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the element to be inserted ");
                       ele = sc.nextInt();
                       q.enqueue(ele);
                       break;
                case 2:n = q.dequeue();      // This is the node that is deleted
                       if(n != null) 
                           System.out.println("Deleted element is = " + n.data);
                       break;
                case 3:q.displayqueue();
                       break; 
            }
            System.out.println("Do you want to continue? (Y/N) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
   
}
