package linked_list;
//Tree program

import java.util.Scanner;

/*
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
*/

class AVLTree
{
    treeNode root;
    public AVLTree()
    {
        root = null;
    }
    
    public int max(int x,int y)  // To find maximum of 2 numbers
    {
        if(x > y)
            return x;
        else
            return y;
    }
    
    public int findheight(treeNode n)  // Height of node n
    {
        if(n == null)
        {
            return 0;
        }
        else return max(1+findheight(n.left),1+findheight(n.right));
    }
    
    public int getBalance(treeNode n)  // In AVL trees, the optimum balance values are -1,0,1 
    {
        return findheight(n.left) - findheight(n.right);
    }
    
    public treeNode leftRotate(treeNode x)
    {        
        treeNode y = x.right;
        treeNode T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        // Return new root
        return y;
    }

    public treeNode rightRotate(treeNode y) 
    {
        treeNode x = y.left;
        treeNode T2 = x.right;
 	
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Return new root
        return x;
    }
    
    
    
    public treeNode insert(treeNode tempRoot,int ele)
    {
        if(tempRoot == null)
            return new treeNode(ele);
        else if(ele < tempRoot.num)
            tempRoot.left = insert(tempRoot.left,ele);
        else if(ele > tempRoot.num)
            tempRoot.right = insert(tempRoot.right,ele);
        // Balancing operations 
        int balance = getBalance(tempRoot);
        
        if(balance > 1 && ele < tempRoot.left.num) // LL case
        {
            return rightRotate(tempRoot);
        }
        else if(balance < 1 && ele > tempRoot.right.num)  // RR case
        {
            return leftRotate(tempRoot);
        }
        else if(balance > 1 && ele > tempRoot.left.num)   // LR case
        {
            tempRoot.left = leftRotate(tempRoot.left);
            return rightRotate(tempRoot);
        }
        else if(balance < 1 && ele < tempRoot.right.num) // RL case
        {
            tempRoot.right = rightRotate(tempRoot.right);
            return leftRotate(tempRoot);
        }
        return tempRoot;  
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
        //Perform the standard BST delete
        if(tempRoot == null)
        {
            return tempRoot;
        }
        else
        {
            if(tempRoot.num > ele)
            {
                tempRoot.left = Delete(ele,tempRoot.left);                
            }
            else if(tempRoot.num < ele)
            {
                tempRoot.right = Delete(ele,tempRoot.right);
            }
            else  // Element is found
            {
                // If node has no children
                if(tempRoot.left == null && tempRoot.right == null)
                {
                    tempRoot =  null;
                }
                else if(tempRoot.left == null)
                {
                    tempRoot = tempRoot.right;
                }
                else if(tempRoot.right == null)
                {
                    tempRoot = tempRoot.left;
                }
                else
                {
                    int temp = findmin(tempRoot);
                    tempRoot.num = temp;
                    Delete(temp,tempRoot.right);                    
                }
            }         
        }
        
        if (tempRoot == null)
            return tempRoot;
        
        // Perform AVL tree operations
        int balance = getBalance(tempRoot);
        
        if(balance > 1 && ele < tempRoot.left.num) // LL case
        {
            return rightRotate(tempRoot);
        }
        else if(balance < 1 && ele > tempRoot.right.num)  // RR case
        {
            return leftRotate(tempRoot);
        }
        else if(balance > 1 && ele > tempRoot.left.num)   // LR case
        {
            tempRoot.left = leftRotate(tempRoot.left);
            return rightRotate(tempRoot);
        }
        else if(balance < 1 && ele < tempRoot.right.num) // RL case
        {
            tempRoot.right = rightRotate(tempRoot.right);
            return leftRotate(tempRoot);
        }
        return tempRoot;  
    }
    
    public void preOrder(treeNode tempRoot)
    {
        if(tempRoot != null)
        {
            System.out.println(tempRoot.num + " "); //Displayig the current element
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

public class AVL_Trees_run {

    public static void main(String[] args) {
        int choice;
        char ch;
        int ele;
        treeNode n;
        AVLTree t = new AVLTree();  // Creating a new stack
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
                       t.root = t.insert(t.root,ele);
                       break;
                case 2:System.out.println("Enter the element to be deleted ");
                       ele = sc.nextInt();
                       t.root = t.Delete(ele,t.root);
                       break;
                case 3:t.preOrder(t.root);
                       break;
                case 4:t.postOrder(t.root);
                       break;
                case 5:t.inOrder(t.root);
                       break;       
                default:System.out.println("Invalid choice");       
            }
            System.out.println("Do you want to continue? (Y/N) ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
    
}



