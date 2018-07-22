/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import java.util.Scanner;

public class stack_array {


    public static void main(String[] args) {
        int[] array = new int[10];
        int top = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("STACK");
        char ch = 'y';
        int choice;
        int ele; //Element to be inserted
        do
        {
            System.out.println("1. Insert element \n2. Delete element\n3. Display topmost element of stack\n4. Display all element of stack\n ");
            System.out.println("Enter choice ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:System.out.println("Enter element to be inserted ");
                       ele = sc.nextInt();
                       if(top == 10)
                       {
                           System.out.println("Stack is full");
                       }
                       else
                       {
                            array[top++] = ele;   
                       }
                       break;
                case 2:if(top == 0)
                       {
                           System.out.println("Stack is empty");
                       }
                       else
                       {
                           ele = array[--top];
                           System.out.println("Deleted element is " + ele);
                       }
                       break;
                case 3:System.out.println("Peep topmost element");
                       System.out.println("Topmost element is " + array[top-1]);
                       break;
                case 4:for(int i = 0;i<top;i++)
                       {
                           System.out.print(array[i] + " ");
                       }
                       break;
            }       
            System.out.println("Do you want to continue? (y/n) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y'||ch == 'Y');
                        
                       
            }
    }

