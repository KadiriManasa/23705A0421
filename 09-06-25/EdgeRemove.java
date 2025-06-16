import java.util.ArrayList;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Graph graph =new Graph(4,true);
        //Edge edge=new Edge(0,1);
        graph.addEdge(0,1);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(2,0);
        graph.addEdge(0,3);
        graph.removeEdge(3,0);
        graph.addEdge(1,2);
        graph.removeEdge(2,1);
        graph.printGraph();
    }
}
class Edge{
    int src;
    int dest;
    int weight;
    Edge (int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
    Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
        this.weight=1;
        
    }
    
    @Override
    public String toString(){
        return this.src + " --> " + this.dest + "[ weight = " + this.weight + " ]";
    }
}
class Graph{
    HashSet<Edge>graph;
    int vertices;
    boolean isDirected;
    Graph (int vertices,boolean isDirected){
        this.vertices=vertices;
        this.isDirected=isDirected;
        graph=new HashSet<Edge>();
            
    }
    public void addEdge(int src,int dest){
        if (isValid (src,dest)){
            Edge e= new Edge(src,dest);
            graph.add(e);
            if (!isDirected){
                Edge e2=new Edge(dest,src);
                graph.add(e2);
            }
        }else{
            System.out.println("Invalid source and destination");
                
        }
            
    }
    public void addEdge(int src,int dest,int weight){
        if (isValid(src,dest)){
            Edge e =new Edge (src,dest,weight);
            graph.add(e);
            if (!isDirected){
                var e2=new Edge(dest,src,weight);
                graph.add(e2);
            }
                
        }else{
        System.out.println("Invalid source and destimation");
                
        }
    }
    public  void removeEdge(int src,int dest){
        if (isValid(src,dest)){
            Edge e= new Edge(src,dest);
            //graph[src][dest]=0;
            graph.remove(e);
           
        
            
            }else{
            System.err.println("Inavalid source and destination");
        }
    }
    public boolean isValid (int src,int dest){
        return src>=0 && dest>=0 && src<vertices && dest< vertices && src!=dest;
            
    }
    void printGraph(){
        System.out.println(graph);
    }
    
}       
    