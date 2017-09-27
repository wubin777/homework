/**
 * 编程练习题2-14：计算BMI
 * 编写程序，提示用户输入体重（以磅为单位）以及身高（以英寸为单位），然后显示BM。
 */

import java.util.Scanner;

public class CulcalateBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches:");
        double height = input.nextDouble();

        // FIND OUT THE BMI
        Double BMI = weight*0.45359237/(height*0.0254)/(height*0.0254);

        System.out.println("BMI is:" + BMI);
    }
}
