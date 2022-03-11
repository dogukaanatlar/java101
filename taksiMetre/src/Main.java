/*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km;
        double total = 10, perKm = 2.20;

        System.out.print("Gidilen mesafeyi KM cinsinden yazınız : ");
        km = scan.nextInt();

        total += (km * perKm); // total += 10

        total = (total < 20) ? 20 : total;
        System.out.println("Ödenemeniz gereken ücret : " + total + " TL 'dir.");
    }
}