// Kruskal MST algorithm
package linked_list;

class edge
{
    int start;
    int end;
    int weight;
    public edge(int s,int e,int w)
    {
        start = s;
        end = e;
        weight = w;
    }
}
class kruskalMST
{
    edge[] edgeSet;   // Set of edges in graph
    edge[] chosenEdges;  // Set of chosen edges
    int top;         // Top of edge set
    int topc;        // Top of chosen edge set
    int[] parent;    // Vertex set 
    public kruskalMST(int nedges,int nvertices)       // Constructor for minimum spanning tree 
    {
        top = -1;
        topc = -1;
        edgeSet = new edge[nedges];
        chosenEdges = new edge[nedges];
        parent = new int[nvertices];
        for(int i=0;i < nvertices;i++)
        {
            parent[i] = -1;
        }
    }
    
    public void add_edge(int start,int end,int weight)  // Adding edge to minimum spanning tree
    {
        edgeSet[++top] = new edge(start,end,weight);  // Adding a new edge object to array
    }
    
    public void edgeSort()
    {
        int i,j;
        for(i=1;i<=top;i++)    // Insertion sort 
        {
            edge T = edgeSet[1];
            for(j = i-1;j>=0;j--)
            {
                if(edgeSet[j+1].weight < edgeSet[j].weight)
                {
                    edgeSet[j+1] = edgeSet[j];
                }
                else
                    break;
            }
            edgeSet[j+1] = T;
        }
    }
    
    public boolean isCycle(int start,int end,int weight)  // Requires the parent array elements to be initialized to -1
    {
        if(parent[start] != -1 && parent[end] != -1)
        {
            return false;            
        }
        else if(parent[start] != -1)
        {
            int x = start;
            start = end;
            end = x;
        }
        int flag = 0;
        int iter = end;
        while(parent[iter] != -1)
        {
            if(parent[iter] == start)
            {
                flag= 1;
                break;
            }    
            iter = parent[iter];
        }
        if(flag == 1)
            return false;
        else
        {
            chosenEdges[++topc] = new edge(start,end,weight);   // Edge is added to the set of chosen edges
            parent[end] = start;
            return true;
        }    
    }
    
    public boolean iscovered()   // To check whether all vertices are covered in the MST
    {
        for(int i=0;i<=parent.length;i++)
        {
            if(parent[i] == -1)
                return false;
        }
        return true;
    }

    public void construct()
    {
        // Sort the edges
        edgeSort();
        // Aded the edges to MST
        for(int count = 0;count <= top && iscovered() == false;count++)
        {
            isCycle(edgeSet[count].start, edgeSet[count].end,edgeSet[count].weight); // This function adds new edges to the MST                
        }
    }
    
    // Print the spanning tree
    
    public void print()
    {
        for(int i = 1;i<=top;i++)     
        {
            System.out.println("Edge : " + edgeSet[i].start + " " + edgeSet[i].end + "  wt = " + edgeSet[i].weight);            
        }
    }
    
    public void printMST()
    {
        for(int i = 1;i<=topc;i++)     
        {
            System.out.println("Edge : " + chosenEdges[i].start + " " + chosenEdges[i].end + "  wt = " + chosenEdges[i].weight);            
        }
    }
}

public class kruskals_mst_run {

    public static void main(String[] args) {
        kruskalMST p = new kruskalMST(7,5);
        p.add_edge(0, 1, 2);
        p.add_edge(0, 3, 6);
        p.add_edge(1, 2, 3);
        p.add_edge(1, 3, 8);
        p.add_edge(1, 4, 5);
        p.add_edge(2, 4, 7);
        p.add_edge(3, 4, 9);
        p.construct();
        p.printMST();  
        // 
    }
    
}
