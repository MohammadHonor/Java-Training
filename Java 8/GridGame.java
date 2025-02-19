import java.util.*;

public class GridGame {
    
    // Helper class to represent a point in the grid
    static class Point {
        int x, y, steps;
        
        public Point(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }
    
    // Directions to move based on the move rule
    static int[][] DIRECTIONS = new int[4][2];

    // Function to rotate the move rule in different directions
    private static void setDirections(int[] moveRule) {
        int x = moveRule[0];
        int y = moveRule[1];
        
        // Forward: (x, y)
        DIRECTIONS[0][0] = x;
        DIRECTIONS[0][1] = y;
        
        // Right: 90 degrees clockwise, (y, -x)
        DIRECTIONS[1][0] = y;
        DIRECTIONS[1][1] = -x;
        
        // Left: 90 degrees counterclockwise, (-y, x)
        DIRECTIONS[2][0] = -y;
        DIRECTIONS[2][1] = x;
        
        // Backward: 180 degrees, (-x, -y)
        DIRECTIONS[3][0] = -x;
        DIRECTIONS[3][1] = -y;
    }

    // Function to check if the next position is within the grid and valid
    private static boolean isValid(int x, int y, int M, int N, int[][] grid) {
        return x >= 0 && x < M && y >= 0 && y < N && grid[x][y] == 0;
    }

    // BFS function to find the shortest path from source to destination
    public static int findShortestPath(int[][] grid, int M, int N, int[] source, int[] destination, int[] moveRule) {
        // Set movement directions based on the move rule
        setDirections(moveRule);
        
        // Check if the source or destination is blocked
        if (grid[source[0]][source[1]] == 1 || grid[destination[0]][destination[1]] == 1) {
            return -1;
        }
        
        // BFS setup
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[M][N];
        
        // Start BFS from the source
        queue.add(new Point(source[0], source[1], 0));
        visited[source[0]][source[1]] = true;
        
        // BFS loop
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            
            // If we reached the destination, return the number of steps
            if (current.x == destination[0] && current.y == destination[1]) {
                return current.steps;
            }
            
            // Explore all 4 directions (forward, right, left, backward)
            for (int[] dir : DIRECTIONS) {
                int newX = current.x + dir[0];
                int newY = current.y + dir[1];
                
                if (isValid(newX, newY, M, N, grid) && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.add(new Point(newX, newY, current.steps + 1));
                }
            }
        }
        
        // If destination is unreachable, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input grid dimensions
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        // Input grid
        int[][] grid = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        // Input source and destination coordinates
        int[] source = new int[2];
        source[0] = sc.nextInt();
        source[1] = sc.nextInt();
        
        int[] destination = new int[2];
        destination[0] = sc.nextInt();
        destination[1] = sc.nextInt();
        
        // Input move rule
        int[] moveRule = new int[2];
        moveRule[0] = sc.nextInt();
        moveRule[1] = sc.nextInt();
        
        // Find and print the shortest path
        int result = findShortestPath(grid, M, N, source, destination, moveRule);
        System.out.println(result);
        
        sc.close();
    }
}

