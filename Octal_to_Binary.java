import java.util.*;
public class Satya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            int k = Integer.parseInt(s,8);
            System.out.println(Integer.toString(k,2));
        }
    }
}