/* 
Take a matrix as input from the user. Search for a given number X and print the indices at which it occure
 */

import java.util.*;
public class SearchElementInTwoDArray {
    public static void ElementPresentAT(int rows, int cols, int x,int num[][]){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(x == num[i][j]){
                    System.out.println("Element found at location: " + i + "," + j);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] num = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                num[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        System.out.println("Printing array");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
        ElementPresentAT(rows, cols, x, num);
        sc.close();
    }
}
