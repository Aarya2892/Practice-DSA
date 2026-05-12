import java.util.*;
public class StringInput {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string here:");
        String str = sc.nextLine();

        System.out.println("Entered String:" + " " + str);
        sc.close();
    }
}
