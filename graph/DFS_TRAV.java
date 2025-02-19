package graph;
import java.util.*;
class Edge {
    int src;
    int dst;
    int wt ;
    Edge(int src , int wt, int dst){
        this.src = src ;
        this.dst = dst ;
        this.wt  = wt ;
    }
    
}

public class DFS_TRAV {

    static void createGraph(ArrayList<Edge>[] graph){

        for( int i = 0 ;i<graph.length ; i++){
    
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 5,1 ));
    
        graph[1].add(new Edge(1, 1,2 ));
        graph[1].add(new Edge(1, 3,3 ));
        graph[1].add(new Edge(1, 5,0 ));
    
        graph[2].add(new Edge(2, 1,3 ));
        graph[2].add(new Edge(2, 3,4 ));
        graph[2].add(new Edge(2, 1,1 ));
    
        graph[3].add(new Edge(3, 1,2 ));
        graph[3].add(new Edge(3, 3,1 ));
    
    
    }
    static boolean hasPath (ArrayList<Edge> graph[] , int src , int dst , boolean visit[]) {

        if(src == dst ){
            return true;
        }

        visit[src] = true;

        for( int i = 0; i<graph[src].size() ;i++ ){
            
            Edge e = graph[src].get(i) ;

            if( !visit[e.dst] && hasPath(graph, e.dst, dst, visit)){
                return true;
            }
        }

        return false;
    }
    static void dfs(ArrayList<Edge> graph[] , int curr , boolean visit []){

        System.out.println(curr);
        visit [curr] = true;
    
        for(int i = 0 ;i< graph[curr].size() ; i++){
            Edge e = graph[curr].get(i);
        if(!visit[e.dst]){
            
            dfs(graph , e.dst , visit) ;
        }
}
    }


public static void main(String[] args) {

     /*                  (5)
                    0 ---------- 1
                               /  \
                              /    \
                        (1)  /      \ (3)
                            /        \ 
                           /          \
                          2 ---------- 3  
                          |    (1)
                          |
                      (3) |
                          |
                          |
                          4 


         */
        int v = 5;
        ArrayList<Edge> graph [] = new ArrayList() ;
        boolean visit[] = new boolean[v] ;
        createGraph(graph);
        // bfs(graph);
        // dfs(graph,0 , visit);
       System.err.println( hasPath(graph, 0, 4, new boolean[v]));
       System.out.println( hasPath(graph, 0, 5, new boolean[v]));
    

}

















    
}

    

