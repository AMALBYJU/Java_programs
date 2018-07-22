
package linked_list;
//Tree program

import java.util.Scanner;


class treeNode
{
    int num;   // Value 
    treeNode left;  // left node
    treeNode right; // right node
    public treeNode(int no)
    {
        num = no;
    }
    
    public void displayTnode()
    {
        System.out.println(num+ " ");
    }    
}

class Tree
{
    treeNode root;
    public Tree()
    {
        root = null;
    }
    
    public void insert(int num)
    {
        treeNode newnode = new treeNode(num); 
        newnode.left = null;
        newnode.right = null;
        if(root == null)
        {
            root = newnode;
        }
        else
        {
            treeNode parent = root;
            treeNode current = root;
            boolean isLeftNode = false;
            while(current != null)
            {
                parent = current;
                if(current.num < num)
                {
                    current = current.right;
                    isLeftNode = false;
                }
                else if(current.num > num)
                {
                    current = current.left;
                    isLeftNode = true;
                }
                else
                {
                    System.out.println("Duplicate elements not allowed");
                    return;
                }
            }
            // Now current node is null
            // Link parent to newnode
            if(isLeftNode == true)
            {
                parent.left = newnode;
            }
            else
            {
                parent.right = newnode;
            }
        }
    }
    
    public int findmin(treeNode current)
    {
        current = current.right;
        treeNode parent = current;
        while(current != null)
        {
            parent = current;
            current = current.left;
        }
        return parent.num;
    }
    
    public treeNode Delete(int ele,treeNode tempRoot)  // Value of element to be deleted
    {
        if(tempRoot == null)
        {
            System.out.println("Element not found");
            return tempRoot;
        }
        else
        {
            if(tempRoot.num > ele)
            {
                tempRoot.left = Delete(ele,tempRoot.left);
                return tempRoot;
            }
            else if(tempRoot.num < ele)
            {
                tempRoot.right = Delete(ele,tempRoot.right);
                return tempRoot;
            }
            else  // Element is found
            {
                // If node has no children
                if(tempRoot.left == null && tempRoot.right == null)
                {
                    return null;
                }
                else if(tempRoot.left == null)
                {
                    return tempRoot.right;
                }
                else if(tempRoot.right == null)
                {
                    return tempRoot.left;
                }
                else
                {
                    int temp = findmin(tempRoot);
                    tempRoot.num = temp;
                    Delete(temp,tempRoot.right);
                    return tempRoot;
                }
            }         
        }
    }
    
    public void preOrder(treeNode tempRoot)
    {
        if(tempRoot != null)
        {
            System.out.println(tempRoot.num + ""); //Displayig the current element
            preOrder(tempRoot.left);
            preOrder(tempRoot.right);
        }
    }
    
        
    public void postOrder(treeNode tempRoot)
    {
        if(tempRoot != null)
        {
            postOrder(tempRoot.left);
            postOrder(tempRoot.right);
            System.out.println(tempRoot.num + ""); //Displaying the current element
        }
    }
    
        
    public void inOrder(treeNode tempRoot)
    {
        if(tempRoot != null)
        {
            inOrder(tempRoot.left);
            System.out.println(tempRoot.num + ""); //Displayig the current element            
            inOrder(tempRoot.right);
        }
    }
    
    public void search(int num)   // search the required element in tree
    {
        treeNode current = root;
        treeNode parent = root;
        boolean isLeftNode = false;
        
        if(current == null)
        {
            System.out.println("Required element is not found");
            return;
        }        
        while(current != null)
        {
             parent = current;
             if(current.num < num)
             {
                 current = current.right;
                 isLeftNode = false;
             }
             else if(current.num > num)
             {
                 current = current.left;
                 isLeftNode = true;
             }
             else
             {
                 System.out.println("Element found");
                 return;
             }
        }
        System.out.println("Element not found");
    }
}

public class tree_run {

    public static void main(String[] args) {
        int choice;
        char ch;
        int ele;
        treeNode n;
        Tree t = new Tree();  // Creating a new stack
        Scanner sc = new Scanner(System.in);  
        System.out.println("MENU");
        System.out.println("1. Insert\n2. Delete\n3. Search\n4. Preorder traversal\n5. Postorder traversal\n6. Inorder traversal");
        do
        {
            System.out.print("Enter your choice ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter the element to be inserted ");
                       ele = sc.nextInt();
                       t.insert(ele);
                       break;
                case 2:System.out.println("Enter the element to be deleted ");
                       ele = sc.nextInt();
                       t.root = t.Delete(ele,t.root);
                       break;
                case 3:System.out.println("Enter the element to be searched ");
                       ele = sc.nextInt();
                       t.search(ele);
                       break; 
                case 4:t.preOrder(t.root);
                       break;
                case 5:t.postOrder(t.root);
                       break;
                case 6:t.inOrder(t.root);
                       break;       
                default:System.out.println("Invalid choice");       
            }
            System.out.println("Do you want to continue? (Y/N) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
    
}
