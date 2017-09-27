/**
 * 编程练习题2-5：计算小费
 * 要求读入一笔费用和酬金率，计算酬金和总钱数
 */

import java.util.Scanner;

public class CulcalateTip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Read in the subtotal and a rate
        System.out.println("Enter the subtotal and a rate:");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble();

        // Obtain the tip and total
        double tip = subtotal * rate/100;
        double total = subtotal + tip;

        System.out.println("The tip is $" + tip +" and total is $" + total);
    }
}
