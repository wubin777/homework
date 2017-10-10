/**
 *  编程练习题3_1：解一元二次方程
 *  编写程序，求解一元二次方程a*x*x+b*x+c=0的两个根
 */
import java.util.Scanner;

public class ExtractRoots {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ,b , c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = b*b-4*a*c;

        // Judge the root
        if(d > 0){
            double r1 = (Math.pow(d,0.5)-b)/(2*a);
            double r2 = (-(Math.pow(d,0.5))-b)/(2*a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if (d == 0){
            double r = -b/(2*a);
            System.out.println("The equation has one root " + r);
        }
        else
            System.out.println("The equation has no real roots" );

    }
}
