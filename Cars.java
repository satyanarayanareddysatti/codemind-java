import java.util.*;
public class atya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        if(n1>n2){
            System.out.println("-1");
        }
        else
        System.out.println(((n1+x)/n2)+1);
    }
}