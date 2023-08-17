import java.util.*;
public class babi{
    public static void main(String[] argu){
        Scanner x = new Scanner(System.in);
        float a = x.nextFloat();
        float b = x.nextFloat();
        float c = x.nextFloat();
        float s = (float)((a+b+c)/2);
        float q = s*(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(q));
    }
}