/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

-Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
-Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
-Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
-Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
-Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
İpucu:
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, tripType;
        double firstAmount, discount, total, roundTrip, discountedAmount;
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scan.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = scan.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2 -> ");
        tripType = scan.nextInt();

        if(distance <= 0 || age < 0 || !(tripType==1 || tripType==2)){
            System.out.println("Hatalı Veri Girdiniz !");
        }else {
            firstAmount = distance * 0.10 ;

            if(age < 12){
                discount = firstAmount * 0.50;
                total = firstAmount - discount;
                //System.out.println("12den küçük");
            }else if (age < 24){
                discount = firstAmount * 0.10;
                total = firstAmount - discount;
                //System.out.println("24den küçük");
            }else if (65< age){
                discount = firstAmount * 0.30;
                total = firstAmount - discount;
                //System.out.println("65den büyük");
            }else{
                total = firstAmount;
                //System.out.println("24-65");
            }

            if (tripType == 2){
                roundTrip = total * 0.20;
                discountedAmount = total - roundTrip;
                total = discountedAmount * 2;
            }

            System.out.println("Toplam tutar : " + total + " TL");
        }
    }
}
