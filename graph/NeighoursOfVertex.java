package graph;
import java.util.*;
/**
 * InnerNeighoursOfVertex
 */
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
public class NeighoursOfVertex {




    public static void main(String[] args) {

        /*               (5)
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
        int v = 4;
        ArrayList<Edge> graph [] = new ArrayList[v] ;

        for(int i = 0; i<4 ;i++) {
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

        // neighours
        for(int i = 0;i<graph[2].size() ; i++){

                Edge e = graph[2].get(i);

                System.out.println(e.dst);
        }


        

        System.out.println("grahp");
    }
    
}
