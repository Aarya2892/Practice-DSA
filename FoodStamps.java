import java.util.*;
public class FoodStamps {
    static class Stamps{
        int FT, FP;

        Stamps(int FT, int FP){
            this.FT = FT;
            this.FP = FP;
        }
    }
    public static int solve(int n, int m, int FT[], int FP[]){
        Stamps[] stamps = new Stamps[n];

        for(int i=0; i<n; i++){
            stamps[i] = new Stamps(FT[i], FP[i]);
        }

        int totalPoints= 0;
        for(int i=0; i<n; i++){
            // System.out.println(((stamps[i].FT - stamps[i].FP)*1));
            if(m>n){
               totalPoints += (stamps[i].FT+(stamps[i].FT - stamps[i].FP)*1);
            }else{
                totalPoints += stamps[i].FT;
            }
            m--;
        }
        return totalPoints;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int FT[] = new int[n];
        for (int i=0; i<n; i++){
           FT[i]= sc.nextInt();
        }

        int FP[] = new int[n];
        for(int i=0; i<n; i++){
            FP[i] = sc.nextInt();
        }

        int ans = solve(n, m, FT, FP);
        System.out.println(ans);
        sc.close();
    }
}
