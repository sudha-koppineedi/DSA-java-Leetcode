import java.util.*;
public class swap {

    public static void swapp(int a, int b){
        int temp = a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[]){
        int a = 5;
        int b = 6;
        swapp(a, b);
        
    }
}
