import java.util.*;

public class inverted {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int line =1; line<=n; line++){
            for(int stars = 1; stars <=(n-line+1) ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}

    
