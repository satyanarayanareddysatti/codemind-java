import java.util.*;
public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];
        for (int i=0 ;i<n;i++){
            intArray[i] = sc.nextInt();
        }
        int s=0;
        for (int b : intArray){
            s += b;
        }
        System.out.println(s);
    }
}