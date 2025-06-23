import java.util.*;

public class Solution_rottenorange {
    public int orangesRotting (int[][]grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> queue=new LinkedList<>();
        int freshCOunt=0;
        int min=0;
        //initialize queue with rotten oranges and count number of fresh oranges

        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    freshCOunt++;
                }
            }
        }

           //direction
    int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    //bfs

    while(!queue.isEmpty()){
        int size=queue.size();
        for(int i=0;i<size;i++){
            int[] current=queue.poll();
            int x=current[0];
            int y=current[1];

            //Check all 4 directions

            for(int [] dir:directions){
                int newX=x+dir[0];
                int newY=y+dir[1];
                //check if the new position is within the bounds


                if(newX>=0 && newX<rows && newY>=0&& newY<cols &&grid[newX][newY]==1){
                    grid[newX][newY]=2;
                    freshCOunt--;
                    queue.offer(new int[] {newX,newY});

                }
            }
            //increment min
            if(!queue.isEmpty()){
                min++;
            }
        }
        
        
    }
    return freshCOunt==0?min:-1;
    }

 
    
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input the dimensions of the grid
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int cols = sc.nextInt();

    // Initialize the grid
    int[][] grid = new int[rows][cols];

    // Input the grid values
    System.out.println("Enter the grid values (0 for empty, 1 for fresh orange, 2 for rotten orange):");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            grid[i][j] = sc.nextInt();
        }
    }

    // Create an instance of Solution and call the method
    Solution solution = new Solution();
    int result = solution.orangesRotting(grid);

    // Output the result
    if (result == -1) {
        System.out.println("It is impossible to rot all oranges.");
    } else {
        System.out.println("Minimum minutes to rot all oranges: " + result);
    }
}

