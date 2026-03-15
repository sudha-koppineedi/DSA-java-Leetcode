import java.util.*;

public class JavaBasics{
     public static void main(String args[]){
        // System.out.print("hello");

        //Data types
        // byte b=8;
        // System.out.println(b);
        // char ch='a';
        // System.out.println(ch);
        // boolean var = false;
        // float price = 10.5;
        // int num = 15;
        // //long
        // //double
        // short n= 240;

        //inputs
        Scanner sc = new Scanner(System.in);   //scanner class
        String input = sc.next();
        System.out.println(input);

        String name = sc.nextLine();
         System.out.println(name);

         int num = sc.nextInt();
          System.out.println(num);

          float price = sc.nextFloat();
           System.out.println(price);



    }
}