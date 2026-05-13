import java.util.*;
public class DefeatMonster {
    static class Monster{
        int MP, BP;
        Monster(int MP, int BP){
            this.MP = MP;
            this.BP = BP;
        }
    }
    public static int TotalMosterDefeatCount(int n, int IP, int MP[], int BP[]){

        Monster monster[] = new Monster[n];

        for(int i=0; i<n; i++){
            monster[i] = new Monster(MP[i], BP[i]);
        }

        Arrays.sort(monster, (a,b)-> a.MP- b.MP);

        int TotalDefeatCount =0; 
        for(int i=0; i<monster.length && IP>= TotalDefeatCount; i++){
           if(IP >= monster[i].MP){
            IP += monster[i].BP;
            TotalDefeatCount ++;
           }
        }
        return TotalDefeatCount;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt(); //Monsters
       int IP = sc.nextInt(); // Initial power

       int MP[] = new int[n]; // Monster Powers
       for(int i=0; i<n; i++){
        MP[i] = sc.nextInt();
       }

       int BP[] = new int[n]; // Bonus points after defeat monster
       for(int i=0; i<n; i++){
         BP[i] = sc.nextInt();
       }

       int ans = TotalMosterDefeatCount(n, IP, MP, BP);
       System.out.println(ans);
       sc.close();
    }
}
