/**
 * 编程练习题2-6：求一个整数个位数的和
 * 编写程序，读入一个在0到1000之间的整数，并将该整数的各位数字相加，求所得结果是多少
 */

import java.util.Scanner;

public class Sigma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer between 0 and 1000:");

        // Find out the sum
        int integer = input.nextInt();
        int hundredsDigit = integer/100;
        int tensDight = integer/10%10;
        int singleDight = integer%10;
        int sum = hundredsDigit + tensDight + singleDight;

        System.out.println("the sum is " + sum);
    }
}

