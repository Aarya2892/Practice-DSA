import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[rows][col];

        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
              arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing 2D Array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}