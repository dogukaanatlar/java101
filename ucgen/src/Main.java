/*Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,tLength;
        double area;

        System.out.println("Üçgen alanının hesaplanması için kenar uzunluklarını giriniz.");
        System.out.print("1. kenar : ");
        a = scan.nextInt();
        System.out.print("2. kenar : ");
        b = scan.nextInt();
        System.out.print("3. kenar : ");
        c = scan.nextInt();

        tLength = (a+b+c) / 2; // üçgenin çevresi/2
        area = sqrt(tLength * ( tLength - a ) * (tLength - b) * (tLength - c)); // area = üçgen alanı

        System.out.println("Üçgenin alanı : " + area + " 'dir.");
    }
}