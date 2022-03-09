/*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kdvOrani = 0, kdvTutari = 0, kdvToplamTutari = 0;

        System.out.print("Hesaplanmasını istediğini tutarı giriniz : ");
        double tutar = scan.nextDouble();

        kdvOrani = (tutar > 1000) ? 0.08 : 0.18;

        kdvTutari = kdvOrani*tutar;
        kdvToplamTutari = tutar+kdvTutari;

        System.out.println("KDV oranı : " + kdvOrani);
        System.out.println("KDV tutarı : " + kdvTutari + " TL");
        System.out.println("Girilen tutar : " + tutar + " TL");
        System.out.println("KDV'li toplam tutar : " + kdvToplamTutari + " TL");
    }
}