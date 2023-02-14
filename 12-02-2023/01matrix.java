class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        // Initialize a queue to store the coordinates of all 0s
        Queue<int[]> queue = new LinkedList<>();
        
        // Initialize a distance array to store the minimum distance to each 0
        int[][] dist = new int[matrix.length][matrix[0].length];
        
        // Initialize all distances to -1, except for 0s (dist=0) and add 0s to the queue
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    dist[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    dist[i][j] = -1;
                }
            }
        }
        
        // Define the four possible directions to traverse the matrix
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        
        // Perform BFS to find the shortest distance to each 0
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= matrix.length || ny >= matrix[0].length || dist[nx][ny] != -1) {
                    continue;
                }
                
                dist[nx][ny] = dist[x][y] + 1;
                queue.offer(new int[]{nx, ny});
            }
        }
        
        // Return the distance matrix
        return dist;
    }
}
