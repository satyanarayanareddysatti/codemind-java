import java.util.*;
public class Satya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double t;
        double u = sc.nextDouble();
        if(u<200){
            t = u*1.20;
        }
        else if(u<400){
            t = u*1.50;
        }
        else if(u<600){
            t = u*1.80;
        }
        else
        t = u * 2;
        
    if (t > 400){
        t = t+t*0.15;
    }
    else{
        t = t+100;
    }
    System.out.printf("%.2f",t);
    }
    
}