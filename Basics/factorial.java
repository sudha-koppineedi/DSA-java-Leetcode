import java.util.*;
public class factorial {

    public static int factor(int n){
        int f = 1;
        for(int i=1; i<= n; i++){
            f=f*i;
        }
        return f;
    }
   
    public static int binCoeff(int n , int r){
      int fact_n = factor(n);
      int fact_r = factor(r);
       int fact_nmr = factor(n-r); 

       int binCoeff = fact_n /(fact_r * fact_nmr);
       return binCoeff;
    }

     public static void main(){
        System.out.println(binCoeff(5, 02));
    }
}
