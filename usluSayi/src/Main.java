/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, n, result=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssünü almak istediğiniz sayıyı giriniz : ");
        a = scan.nextInt();
        System.out.print("Üssü giriniz : ");
        n = scan.nextInt();

        for (int i=1; i <= n; i++){
            result *= a;
        }
        System.out.println(a + "^" + n + " = " + result);
    }
}