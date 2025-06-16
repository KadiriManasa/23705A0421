public class Mian{
    public static void main(String[] args){
        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        System.out.println("Matrix before removing elements");
        graph.printGraph();
        graph.removeEdge(1,2);
        System.out.println("Matrix after removing elements");
       
        graph.printGraph();
        System.out.println(graph.isHaving(0,1));

    }
}






class Graph{
    int[][] graph;
    int vertices;
    Graph(int vertices){
        graph=new int[vertices][vertices];
        this.vertices=vertices;
    }
    void addEdge(int src,int dest){
        if(src>=0 && dest>0 && src!=dest && src<vertices && dest<vertices){
            graph[src][dest]=1;
            graph[dest][src]=1;
        }else{
            System.out.println("Invalid source and destination");
            return;
        }
    }
    void removeEdge (int src,int dest){
        if (src>=0 && dest>0 && src!=dest && src<vertices && dest<vertices){
            graph[src][dest]=0;
            graph[dest][src]=0;
        }else{
            System.out.println("inavalid source and destination");
            return;
        }
    }
    boolean isValid(int src,int dest){
        return src>=0 && dest>0 && src!=dest && src<vertices && dest<vertices;
        
    }
    boolean isHaving(int src, int dest){
        if (isValid(src,dest)){
            if(graph[src][dest]==1){
                return true;
            }else{
                return false;
            }
        }
        System.out.println("Invalid source and destination");
        return false;
        
    }
    void printGraph(){
        for (int i=0;i<vertices;i++){
            for (int j=0;j<vertices;j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}