package linked_list;
// DFS traversal of graph

class stack      // Stack is used for DFS traversal  
{
    private final int size = 20;
    int[] st;
    int top;
    stack()
    {
        st = new int[size];
        top = -1;
    }
    public void push(int ele)
    {
        st[++top] = ele;
    }
    public int pop()
    {
        return st[top--];  // return the topmost deleted element
    }
    
    public int peek()
    {
        return st[top];   // Return the topmost element
    }
    
    public boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
    }
    public void display()  // Display the entire stack
    {
        for(int i = 0;i<=top;i++)
        {
            System.out.print(st[i] + " ");
        }
        System.out.println(); 
    }    
}

class vertex
{
    char label;  // Gives label to char
    boolean wasVisited;  // 
    
    public vertex(char l)   //Constructor
    {
        wasVisited = false;
        label = l;
    }
    public void visit()
    {
        wasVisited = true;
    }
    public boolean isVisited()  //Return status of vertex
    {
        return wasVisited;
    }
}


class graph_dfs {
    
    static final int maxVerts = 20;  // Maximum number of vertice that can be added to the graph
    stack S;   // Working stack
    vertex[] vertexSet;  // Set of all vertices
    int[][] adjMatrix;  // Adjacency matrix
    int nverts; // Number of vertices in graph -1
    
    public graph_dfs()    // Initialise all variables
    {
        S = new stack();   // Working stack
        vertexSet = new vertex[maxVerts];  // Set of all vertices
        adjMatrix = new int[maxVerts][maxVerts];  // Adjacency matrix
        nverts = 0;
        for(int i = 0;i<maxVerts;i++)
        {
            for(int j=0;j<maxVerts;j++)
            {
                adjMatrix[i][j] = 0;
            }            
        }
    }
    
    public void addVertex(char lab)
    {
        vertexSet[nverts++] = new vertex(lab);
    }
    
    public void addEdge(int start,int end) 
    {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }
    
    public void displayVertex(int v)
    {
        System.out.println(vertexSet[v].label + " ");
    }
    
    int getUnvisitedVertex(int index)
    {
        for(int i=0;i<=nverts;i++)
        {
            if(adjMatrix[index][i] == 1 && vertexSet[i].isVisited() == false)  // There exists a path between the vertex and other and it is unvisited
            {
                return i;   // Returns index of required vertex
            }    
        }
        return -1;        
    }
    
    public void DFS()
    {
        S.push(0);              // Add the first vertex
        displayVertex(0);       
        vertexSet[0].visit();
        
        while(!S.isEmpty())
        {
            int vertIndex = S.peek();   // vertIndex is the index of the current vertex
            int newVert = getUnvisitedVertex(vertIndex);
            if(newVert != -1)
            {
                S.push(newVert);   
                displayVertex(newVert);       
                vertexSet[newVert].visit();
            }
            else
            {
                S.pop();
            }
        }
    }
}
public class graph_run
{
    public static void main(String[] args) {
        graph_dfs g = new graph_dfs();  // New graph is created
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');
        g.addVertex('F');
        g.addVertex('G');
        g.addVertex('H');
        g.addVertex('I');                g.addEdge(0,1);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.addEdge(1,5);
        g.addEdge(5,7);
        g.addEdge(3,6);
        g.addEdge(6,8);
        
        
        System.out.println("Visits: ");
        g.DFS();
        System.out.println();
    }    
}
    
