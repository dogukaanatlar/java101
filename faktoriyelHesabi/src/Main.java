/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, nTotal = 1, rTotal = 1, nrDif = 1, combination;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kombinasyon için Eleman Sayısını 'n' giriniz : ");
        n = scan.nextInt();
        System.out.print("Kombinasyon için Seçim Sayısı 'r' giriniz : ");
        r = scan.nextInt();

        if (r <= n) {
            for (int i = 1; i <= n; i++) {
                nTotal *= i;
            }
            for (int i = 1; i <= r; i++) {
                rTotal *= i;
            }
            for (int i = 1; i <= (n - r); i++) {
                nrDif *= i;
            }
            combination = nTotal / (rTotal * nrDif);
            System.out.println("Girilen sayıların kombinasyonu : " + combination);
        }else {
            System.out.println("Hatalı sayılar girdiniz! 'r' sayısı n'den büyük olamaz");
        }
    }
}