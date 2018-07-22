package linked_list;
import java.util.Scanner;
// Adjacency matrix is used for tree representation

class mst
{
    static int max;
    int[][] graph;   // Adjacency matrix
    int[] key;         
    boolean[] visited;
    int[] parent;    // Maintains index of parent node for each child node
    
    public mst(int nverts)       // Constructor for minimum spanning tree 
    {
        max = nverts; 
        graph = new int[max][max];
        key = new int[max];
        visited = new boolean[max];
        parent = new int[max];
        for(int i = 0;i<max;i++)
        {
            key[i] = Integer.MAX_VALUE;
            visited[i] = false;
            parent[i] = Integer.MAX_VALUE;
        }        
    }
    
    public void add_edge(int start,int end,int weight)
    {
        graph[start][end] = weight;    
        graph[end][start] = weight;
    }
    
    public int findminkey()
    {
        int min = Integer.MAX_VALUE;
        int pos = Integer.MAX_VALUE;
        
        for(int i = 0;i<max;i++)
        {
            if(visited[i] == false && key[i] < min)
            {
                min = key[i];
                pos = i;
            }
        }
        return pos;
    }
        
    public void construct()
    {
        // Start the MST with the first vertex
        key[0] = 0;
        parent[0] = -1;
        visited[0] = true;
        int iter = 0;    // Variable that stores the index of the current node
        // Set the key values for the neighbouring vertices
        for(int count = 0;count<(max-1);count++)
        {
            
            visited[iter] = true;
            for(int i = 0;i < max;i++)
            {
                if(graph[iter][i] < key[i] && visited[i] == false && graph[iter][i] != 0)
                {
                    key[i] = graph[iter][i];
                    parent[i] = iter;
                }
            }
            iter = findminkey();
        }
    }
    
    // Print the spanning tree
    
    public void print()
    {
        for(int i = 1;i<max;i++)    // i is not given a value of 0 because parent of root node is -1 
        {
            System.out.println("Edge : " + i + " " + parent[i] + "  wt = " + graph[i][parent[i]]);            
        }
    }
}

public class prims_mst_run {

    public static void main(String[] args) {
        mst p = new mst(5);
        p.add_edge(0, 1, 2);
        p.add_edge(0, 3, 6);
        p.add_edge(1, 2, 3);
        p.add_edge(1, 3, 8);
        p.add_edge(1, 4, 5);
        p.add_edge(2, 4, 7);
        p.add_edge(3, 4, 9);
        p.construct();
        p.print();  
        // 
    }
    
}
