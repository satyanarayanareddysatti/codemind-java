import java.util.*;
public class Satya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            int d = Integer.parseInt(s,16);
            String k = Integer.toString(d,2);
            if(k.length()%4 == 0){
                System.out.println(k);
            }
            else{
                int z = 4-k.length()%4;
                for (int j= 0; j<z; j++){
                    k= '0'+ k;
                }
                    System.out.println(k);
            }
        }
    }
}