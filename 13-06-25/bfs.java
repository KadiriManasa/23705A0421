// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        Graph graph=new Graph(5,true);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(2,3);
        graph.printGraph();
        //System.out.println();
        graph.dfs(0,new boolean[5]);
        System.out.println();
        graph.bfs();
        
        
    }
}


class Graph{
    ArrayList<HashSet<Integer>> graph;
    
    int vertices;
    boolean isDirected;
    Graph (int vertices,boolean isDirected){
        //graph=new  ArrayList<HashSet<Integer>>();
        
        this.vertices=vertices;
        this.isDirected=isDirected;
        this.graph=new  ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new HashSet<Integer>());
        }

       
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).add(dest);
            if(!isDirected)
            this.graph.get(dest).add(src);
            
        }
        else{
            
            for(int i=0;i<this.vertices;i++){
                System.out.print(i + " ");
                    
            }
            
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).remove(dest);
            if(!isDirected){
                this.graph.get(dest).remove(src);
            }else{
                for(int i=0;i<this.vertices;i++){
                    System.out.print(i + " ");
                }
            }
        }
    }
    boolean isHavingEdge(int src,int dest){
        return this.graph.get(src).contains(dest);
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i + ":" + graph.get(i)); 
        }
    }
    HashSet<Integer>getNeibhours(int src)throws IndexOutOfBoundsException {
        if(src>=0 && src<vertices)
            return this.graph.get(src);
        throw new IndexOutOfBoundsException("Invalid");
        
    }
    
    boolean isValid(int src,int dest){
        return src>=0 &&dest>=0 && src<vertices && dest <vertices && src!=dest;
    }
    void dfs(int start,boolean[] visited){
        visited[start]=true;
        System.out.print(start + " ");
        var neibhours=getNeibhours(start);
        for(int neibhour:neibhours){
            if(!visited[neibhour]){
                dfs(neibhour,visited);
            }
        }
    }
    void bfs(){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] visited=new boolean[vertices];
        while(!q.isEmpty()){
            int current =q.remove();
            if(!visited[current]){
                visited [current]=true;
                System.out.print(current + " ");
                var neibhours=getNeibhours(current);
                for(Integer neibhour:neibhours){
                    q.add(neibhour);
                }
            }
        }
    }
    
    
}