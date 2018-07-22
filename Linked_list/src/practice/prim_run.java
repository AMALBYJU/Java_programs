/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;

class prim_mst
{
    int[][] graph;
    int[] key;
    int[] parent;
    boolean[] visited;
    int vertices;
    
    public prim_mst(int v)
    {
        vertices = v;
        graph = new int[v][v];
        key = new int[v];
        visited = new boolean[v];
        parent = new int[v];
        for(int i = 0;i<v;i++)
        {
            for(int j = 0;j<v;j++)
            {
                graph[i][j] = Integer.MAX_VALUE;
            }
            key[i] = Integer.MAX_VALUE;
            parent[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
    }
    // Function to add edge
    public void add_edge(int start,int end,int weight)
    {
        graph[start][end] = graph[end][start] = weight;
    }
    // Find the index of vertex with minimum key value
    
    public int findminkey()
    {
        int min = Integer.MAX_VALUE;
        int pos = Integer.MAX_VALUE;
        
        for(int i = 0;i<vertices;i++)
        {
            if(key[i] < min && visited[i] == false)
            {
                min = key[i];
                pos = i;
            }
        }
        return pos;
    }
    // Function to construct the MST
    public void construct()
    {
        key[0] = 0;      // Start with the first vertex
        parent[0] = -1;
        int iter = 0;
        for(int count = 1;count<vertices;count++)
        {
            visited[iter] = true;
            for(int i = 0;i<vertices;i++)
            {
                if(key[i] > graph[iter][i] && visited[i] == false)
                {
                    key[i] = graph[iter][i];
                    parent[i] = iter;
                }
            }
            iter = findminkey();
        }
    }
    
    public void display()
    {
        for(int i = 0;i<vertices;i++)
        {
            System.out.println("Edge " + i + " " + parent[i] + "wt = " + key[i]);
        }
    }
        
}
public class prim_run {

    public static void main(String[] args) {
        prim_mst p = new prim_mst(5);
        p.add_edge(0, 1, 2);
        p.add_edge(0, 3, 6);
        p.add_edge(1, 2, 3);
        p.add_edge(1, 3, 8);
        p.add_edge(1, 4, 5);
        p.add_edge(2, 4, 7);
        p.add_edge(3, 4, 9);
        p.construct();
        p.display();  
    }
    
}
