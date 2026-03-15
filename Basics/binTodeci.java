import java.util.*;
public class binTodeci {
    public static void binToDeci(int binNum){
        int pow =0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (int)(lastDigit * Math.pow(2, pow));
            pow++;
            binNum /= 10;
            
        }  
        System.out.println(decNum);
    }

    public static void decToBin(int decNum){
        int pow =0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (int) (rem * Math.pow(10, pow));
            pow++;
            decNum/=2;            
        }System.out.println(binNum);

    }

    public static void main(String[] args) {
        binToDeci(101);
        decToBin(11);
    }
    
}
