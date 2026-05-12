import java.util.*;
public class MadeLetterCap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        char ch = sc.next().charAt(0);
        StringBuffer sb = new StringBuffer("");

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
