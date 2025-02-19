import java.util.*;

public class MaxExpertiseTeam {
    
    // Function to perform DFS and find connected components
    private static void dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, component);
            }
        }
    }

    // Function to find the maximum expertise team
    public static int findMaxExpertiseTeam(int n, int c, int[][] conflicts, int[] expertise) {
        // Build graph with conflicts
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Add conflict edges to the graph
        for (int[] conflict : conflicts) {
            int u = conflict[0] - 1;
            int v = conflict[1] - 1;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Find connected components
        boolean[] visited = new boolean[n];
        List<List<Integer>> components = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(i, graph, visited, component);
                components.add(component);
            }
        }
        
        int totalMaxExpertise = 0;
        
        // For each component, find the max independent set
        for (List<Integer> component : components) {
            int m = component.size();
            // DP array to keep track of maximum expertise
            int[] dp = new int[m + 1];
            
            // Consider each employee in the component
            for (int i = 0; i < m; i++) {
                int emp = component.get(i);
                int expert = expertise[emp];
                
                // Two options: either include the current employee or exclude them
                if (i == 0) {
                    dp[i + 1] = expert;
                } else {
                    dp[i + 1] = Math.max(dp[i], dp[i - 1] + expert);
                }
            }
            
            // Add the max expertise from this component to the total
            totalMaxExpertise += dp[m];
        }
        
        return totalMaxExpertise;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();  
        int c = sc.nextInt();  
        
        // Conflict pairs input
        int[][] conflicts = new int[c][2];
        for (int i = 0; i < c; i++) {
            conflicts[i][0] = sc.nextInt();
            conflicts[i][1] = sc.nextInt();
        }
        
        // Expertise values input
        int[] expertise = new int[n];
        for (int i = 0; i < n; i++) {
            expertise[i] = sc.nextInt();
        }
        
        // Output the maximum expertise of the team
        System.out.println(findMaxExpertiseTeam(n, c, conflicts, expertise));
        
        sc.close();
    }
}

