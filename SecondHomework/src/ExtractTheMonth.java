/**
 *  编程练习题3_4：随机月份
 *  编写一个随机产生1和12之间整数的程序，并且根据数字1，2...12，显示相应的英文月份。
 */

import java.util.Scanner;

public class ExtractTheMonth {
    public static void main(String[] args){

        // Generate one random integer between 1 and 12
        int month = (int)(Math.random() * 12 + 1);
        System.out.println("The generated random integer between 1 and 12 is " + month);

        switch (month ) {
            case 12 : System.out.println("December");break;
            case 11 : System.out.println("November");break;
            case 10 : System.out.println("October");break;
            case 9  : System.out.println("September");break;
            case 8 : System.out.println("August");break;
            case 7 : System.out.println("July");break;
            case 6 : System.out.println("June");break;
            case 5 : System.out.println("May");break;
            case 4 : System.out.println("April");break;
            case 3 : System.out.println("March");break;
            case 2 : System.out.println("February");break;
            case 1 : System.out.println("January");
        }

    }
}
