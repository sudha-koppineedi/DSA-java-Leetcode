import java.util.*;

public class functions {

    public static int calculateSum(int a, int b){ // paramters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); //arguments or actual parameters
        System.out.println("sum is : "+ sum);


    }
    
}
