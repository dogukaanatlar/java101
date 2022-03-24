/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?
4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int date,divisionRemainder;
        String animal = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        date = scan.nextInt();

        divisionRemainder = date % 12;
        switch (divisionRemainder) {
            case 0 -> animal = "Maymun";
            case 1 -> animal = "Horoz";
            case 2 -> animal = "Köpek";
            case 3 -> animal = "Domuz";
            case 4 -> animal = "Fare";
            case 5 -> animal = "Öküz";
            case 6 -> animal = "Kaplan";
            case 7 -> animal = "Tavşan";
            case 8 -> animal = "Ejderha";
            case 9 -> animal = "Yılan";
            case 10 -> animal = "At";
            case 11 -> animal = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + animal);
    }
}