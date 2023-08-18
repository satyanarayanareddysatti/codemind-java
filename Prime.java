import java.util.*;
public class Prime{
    public static void main(String[] argu){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0,i;
        for(i=1; i<=n; i++)
        {
            if(n%i == 0){
                c++;
            }
        }
        if(c==2){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
    }
}