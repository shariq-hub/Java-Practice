package Tasks;

import java.util.Random;
import java.util.Scanner;

public class RevcProgramTest {

    private static final char PLAYER='P';
    private static final char GOAL='G';
    private static final char OBSTACLE='X';
    private static final char MOVABLEAREA='-';
    private static final int SIZE=5;

    private static final char[][] grid=new char[SIZE][SIZE];
    private static int goalFirstLocation=0;
    private static int goalSecondLocation=0;

    private static int PLAYERINITIALVALUE1=0;
    private static int PLAYERINITIALVALUE2=0;

    private static Random random=new Random();
        public static void main(String[] args) {
        createGrid(grid);
        displayGrid();
        grid[0][0] = PLAYER; 
        
        
          Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move (W, A, S, D): ");
            char direction = scanner.next().charAt(0);
            movePlayer(direction);

            displayGrid(); 

            
            if (checkGoal()) {
                System.out.println("Congratulations! You've reached the goal.");
                break;
            }
        }
        scanner.close(); 
    }




    public static void createGrid(char [][] arr){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = MOVABLEAREA;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            int obstacleFirstLocation = random.nextInt(SIZE);
            int obstacleLastLocation = random.nextInt(SIZE);
            if (obstacleFirstLocation != 0 || obstacleLastLocation != 0) {
                grid[obstacleFirstLocation][obstacleLastLocation] = OBSTACLE;
            }
        }

        goalFirstLocation = random.nextInt(SIZE);
        goalSecondLocation = random.nextInt(SIZE);
        grid[goalFirstLocation][goalSecondLocation] = GOAL;
    }


    private static void displayGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkGoal() {
        return PLAYERINITIALVALUE1 == goalFirstLocation && PLAYERINITIALVALUE2 == goalSecondLocation;
    }




    private static void movePlayer(char DirectionToMove) {
        int playerNewValue1 = PLAYERINITIALVALUE1;
        int playerNewValue2 = PLAYERINITIALVALUE2;
    
        switch (DirectionToMove) {
            case 'w':
                playerNewValue1 = PLAYERINITIALVALUE1 - 1;
                break;
            case 'a':
                playerNewValue2 = PLAYERINITIALVALUE2 - 1;
                break;
            case 's':
                playerNewValue1 = PLAYERINITIALVALUE1 + 1;
                break;
            case 'd':
                playerNewValue2 = PLAYERINITIALVALUE2 + 1;
                break;
        }
    
        // First we need to check if it is inside the grid or not then make it go from here.
        if (playerNewValue1 >= 0 && playerNewValue1 < SIZE && playerNewValue2 >= 0 && playerNewValue2 < SIZE) {
    
            if (grid[playerNewValue1][playerNewValue2] != OBSTACLE) {
                grid[PLAYERINITIALVALUE1][PLAYERINITIALVALUE2] = MOVABLEAREA;
                PLAYERINITIALVALUE1 = playerNewValue1;
                PLAYERINITIALVALUE2 = playerNewValue2;
                grid[PLAYERINITIALVALUE1][PLAYERINITIALVALUE2] = PLAYER;
            } else {
                System.out.println("You Hit an Obstacle Please Try again Later!");
            }
        } else {
            System.out.println("You Hit a Boundary. Try Again!");
        }
    }
}
