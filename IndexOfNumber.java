import java.util.Scanner;

public class IndexOfNumber {
    public static void PrintIndexOfLargeNumber(int n, int[] num, int x){
        for(int i=0; i<n; i++){
            if(num[i] == x){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x= sc.nextInt();

        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        int LargeNum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(num[i] > LargeNum){
                LargeNum = num[i];
                System.out.println(i);
            }
        }
        sc.close();
        PrintIndexOfLargeNumber(n, num, x);
    }
}
