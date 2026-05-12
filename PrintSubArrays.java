import java.util.*;
public class PrintSubArrays {

    public static void PrintSubArray(int n, int arr[]){
       for(int i=0; i<n; i++){
        int start = i;
        for(int j=i; j<n; j++){
            int end = j;
            for(int k=start; k<=end; k++){
                System.out.println(arr[k] );
            }
            System.out.println();
        }
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        PrintSubArray(n, arr);
        sc.close();
    }
}
