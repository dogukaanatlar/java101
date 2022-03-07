/*Not Ortalaması Hesaplayan Program
 *Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 *
 *Ödev
 *Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

 *Not : If ve Else kullanılmayacak...
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = scan.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = scan.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;
        System.out.println("Ortalamanız : " + ortalama);

        String kosul = (ortalama < 60) ? "Ortalamanız düşük." : "Tebrikler! Derslerinizi geçtiniz.";
        System.out.println(kosul);
    }
}