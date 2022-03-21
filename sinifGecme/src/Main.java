/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz;
        double ort, toplam=0, sayac=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Notlarınızı giriniz: ");
        System.out.print("Matematik notunuz : ");
        mat = scan.nextInt();
        if (mat >= 0 && 100 >= mat){
            toplam += mat;
            sayac++;
        }else{
            System.out.println("Girdiğiniz not 0-100 aralığı dışındadır. Ortalamaya dahil edilmemiştir.");
        }

        System.out.print("Fizik notunuz : ");
        fiz = scan.nextInt();
        if (fiz >= 0 && 100 >= fiz){
            toplam += fiz;
            sayac++;
        }else{
            System.out.println("Girdiğiniz not 0-100 aralığı dışındadır. Ortalamaya dahil edilmemiştir.");
        }

        System.out.print("Türkçe notunuz : ");
        turk = scan.nextInt();
        if (turk >= 0 && 100 >= turk){
            toplam += turk;
            sayac++;
        }else{
            System.out.println("Girdiğiniz not 0-100 aralığı dışındadır. Ortalamaya dahil edilmemiştir.");
        }

        System.out.print("Kimya notunuz : ");
        kim = scan.nextInt();
        if (kim >= 0 && 100 >= kim){
            toplam += kim;
            sayac++;
        }else{
            System.out.println("Girdiğiniz not 0-100 aralığı dışındadır. Ortalamaya dahil edilmemiştir.");
        }

        System.out.print("Müzik notunuz : ");
        muz = scan.nextInt();
        if (muz >= 0 && 100 >= muz){
            toplam += muz;
            sayac++;
        }else{
            System.out.println("Girdiğiniz not 0-100 aralığı dışındadır. Ortalamaya dahil edilmemiştir.");
        }

        ort = toplam / sayac;

        if(ort >= 55){
            System.out.println("Not ortalamanız : " + ort + " . Geçtiniz");
        }else{
            System.out.println("Not ortalamanız : " + ort + " . Kaldınız");
        }
    }
}
