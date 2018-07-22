package linked_list;

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

class linkoperation
{
    node first;  // Head node
    
    public linkoperation()  // I*ntitialising the first pointer to NULL
    {
        first = null;
    }
    
    public void insertFirst(int ele)
    {
        node n = new node(ele);
        n.next = first;
        first = n;
    }
    
    public node deleteFirst()
    {
        node temp = first;
        first = first.next;
        return temp; 
    }
    
    public void displayList()   // Display the entire linked list
    {
        node cursor = first;  // Iterator over the list
        while(cursor != null)
        {
            cursor.display();
            cursor = cursor.next;
        }
        System.out.println();   
    }
    
    public boolean isEmpty()
    {
        return (first == null);
    }
}
public class Linked_list {

    public static void main(String[] args) {
        linkoperation l = new linkoperation();
        l.insertFirst(10);
        l.insertFirst(20); 
        l.insertFirst(30);
        l.insertFirst(40);
        l.insertFirst(50);
        l.insertFirst(60);
        //Display the list
        l.displayList();
        
        // Delete the list
        
        while(!l.isEmpty())
        {
            node deleted = l.deleteFirst();
            System.out.print("Deleted: ");
            deleted.display();
        }
        
        // List is empty
        
        l.displayList();
    }    
}
