// Take the input from user, sort the array and return the max sum 
/*
n=3
Marks = {20, 10, 30}
Practical_Marks = {5, 15, 15}
output = 35, index =2;
 */

import java.util.*;
public class ReturnMaxMarks {

    static class Marks{
        int M, PM;
        Marks(int M, int PM){
            this.M = M;
            this.PM = PM;
        }
    }
    public static int MaxMarks(int n, int M[], int PM[]){
        Marks marks[] = new Marks[n];

        for(int i=0; i<n; i++){
            marks[i] = new Marks(M[i], PM[i]);
        }
        Arrays.sort(marks, (a,b)->{
            if(b.M != a.M) return b.M -a.M;
            return b.PM-a.PM;
        });

        int TotalSum= 0;
        int currentSum = 0;
        for(int i=0; i<marks.length; i++){
            currentSum += (marks[i].M + marks[i].PM);
            System.out.println(currentSum);
            if(TotalSum < currentSum){
                TotalSum = currentSum;
            }
            currentSum =0;
        }
        return TotalSum;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int M[] = new int[n];
      for(int i=0; i<n; i++){
        M[i] = sc.nextInt();
      }

      int PM[] = new int[n];
      for(int i=0; i<n; i++){
        PM[i] = sc.nextInt();
      }
    
      int ans  = MaxMarks(n, M, PM);
      System.out.println(ans);
      sc.close();
    }
}
