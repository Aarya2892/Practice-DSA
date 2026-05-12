import java.util.*;
public class BinarySort {
    public static int ElementUsingBinarySearch(int n, int x, int num[]){
     for(int i=0; i<num.length; i++){
        int start = i;
        int end = num.length;
        int mid = (start+end)/2;
        if( x == num[mid]){
            return mid;
        }else if( x > num[mid]){
            start = mid+1;
        }else if( x < num[mid]){
            end = mid-1;
        }
    }
     return -1;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();

      int num[] = new int[n];

      for(int i=0; i<n; i++){
        num[i] = sc.nextInt();
      }
       int ans  = ElementUsingBinarySearch(n, x, num);
       System.out.println(ans);
       sc.close();
    }
}
