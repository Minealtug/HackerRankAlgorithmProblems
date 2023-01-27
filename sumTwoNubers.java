import java.util.Scanner;

/**
 * sumTwoNubers
 */
public class sumTwoNubers {

    public static double solveMeFirst(double a, double b){ 
        double sum = a+b;

        return sum;
    };

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
         double a= scan.nextDouble();
         double b= scan.nextDouble();
        solveMeFirst(a,b);
    }
}