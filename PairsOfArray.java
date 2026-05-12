import java.util.*;
public class PairsOfArray {
    public static void PrintPairsOfArrray(int n, int arr[]){
        for(int i=0; i<n; i++){
            int current = arr[i];
            for(int j= i+1; j<n; j++){
                System.out.println("(" + current + "," + arr[j] + ")");
            }
        }
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      sc.close();

      PrintPairsOfArrray(n, arr);
    }
}
