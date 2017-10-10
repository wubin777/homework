/**
 * 编程练习题5_1：统计正数和负数的个数然后计算这些数的平均值
 * 编写程序，读入未指定个数的整数，判断读入的整数和负数各有多少个，然后计算这些输入值的总和及其平均值（不对0计数）。
 * 当输入为0时，表明程序结束。
 */

import java.util.Scanner;

public class Exercise5_1 {
    public static void main (String[] args) {
        int countPositive = 0,countNegative = 0,sum = 0,count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter some integers, the input ends if the last integer is 0: ");
        int num = input.nextInt();

        while (num != 0){
             if(num > 0)
                countPositive++;
             else
                countNegative++;
             sum += num;
             count++;
             num = input.nextInt();
        }
        if (count == 0)
            System.out.println("You didn't enter any number");
        else {
            System.out.println("The number of positives is " + countPositive);
            System.out.println("The number of negatives is " + countNegative);
            System.out.println("The sum is " + sum);
            System.out.println("The average is " + sum * 1.0 / count);
        }
    }
}