/* Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = scan.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = (2*n-1); k >= (2 * i + 1); k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}