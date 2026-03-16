import java.util.*;

public class patterns {
    public static void hollow_rectangle(int totRows, int totCols){

        //outer - rows
        for(int i=1; i<=totRows; i++){
            //inner - columns
            for(int j=1; j<=totCols; j++){
                //cell - (i,j)
                    if(i == 1 || i == totRows || j == 1 || j == totCols){ //if boundary cells
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }

    }

    public static void inverted_rotated_half_pyramid(int n){

        //outer - row(track)
        for(int i=1; i<=n; i++){

            //inner-1(spaces first)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner(2) (stars next)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void inverted_half_pyramid_numbers(int n){
        for(int i =1; i<=n; i++){
            for(int j=1;j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int count =1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void one_zero_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 ==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //FIRST _ HALF
        for(int i=1; i<=n; i++){

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //SECOND_HALF
        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces - (n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces - (n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //hollow rectangle - stars
            for(int j=1; j<=n; j++){
                //cell - (i,j)
                if(i == 1 || i == n || j == 1 || j == n){ //if boundary cells
                   System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            //spaces - (n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars - (2i -1)
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            //spaces - (n-i)
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars - (2i -1)
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();            
        }

   }

    public static void main(String args[])
    {
        // hollow_rectangle(4, 5);
        // inverted_rotated_half_pyramid(5);
        // inverted_half_pyramid_numbers(4);
        // floyd_triangle(7);
        // one_zero_triangle(5);
        // butterfly(4);
        // solid_rhombus(5);
        // hollow_rhombus(7);
        // diamond(9);
    
    }

}

    