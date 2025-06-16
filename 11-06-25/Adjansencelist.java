// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
     Graph graph =new Graph(4);
     graph.addEdge(0,1);
     graph.addEdge(0,2);
     graph.addEdge(0,3);
     graph.addEdge(1,2);
     graph.printGraph();
    }
}
class Graph{
    ArrayList<HashSet<Integer>>graph;
    int vertices;
    Graph(int vertices){
        this.vertices=vertices;
        this.graph=new ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new HashSet<Integer>());
            
            
        }
    }
    public boolean isValid (int src,int dest){
        return src>=0 && dest>=0 && src<vertices && dest< vertices && src!=dest;
            
    }
    void addEdge(int src, int dest){
        if (isValid (src, dest)){
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }else{
            System.out.println("Invalid source and destination");
        }
        
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i + " ," + graph.get(i));
        }
    }
}