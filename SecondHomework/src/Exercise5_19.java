/**
 * 编程练习题5_19:打印金字塔形的数字
 * 编写一个嵌套的for循环，打印下面的输出：
 *                                          1
 *                                     1    2    1
 *                                1    2    4    2    1
                             1    2    4    8    4    2    1
                        1    2    4    8   16    8    4    2    1
                   1    2    4    8   16   32   16    8    4    2    1
              1    2    4    8   16   32   64   32   16    8    4    2    1
         1    2    4    8   16   32   64  128   64   32   16    8    4    2    1
 *
 */

public class Exercise5_19 {
    public static void main(String[] args) {
        int number = 0;
        for (int row = 0; row <= 7; row++) {

            // Print blanks
            for (int col = 1; col <= 7 - row; col++)
                System.out.print("     ");

            // Print left half of the row
            for (int col = 0; col <= row; col++) {
                number = (int)Math.pow(2, col);
                if (number > 100) {
                    System.out.print("  " + number);
                }
                else if (number > 10) {
                    System.out.print("   " + number);
                }
                else {
                    System.out.print("    " + number);
                }
            }

            // Print the right half of the row
            for (int col = row - 1; col >= 0; col--) {
                number = (int)Math.pow(2, col);
                if (number > 100) {
                    System.out.print("  " + number);
                }
                else if (number > 10) {
                    System.out.print("   " + number);
                }
                else {
                    System.out.print("    " + number);
                }
            }

            // Start a new line
            System.out.print('\n');
        }
    }
}

