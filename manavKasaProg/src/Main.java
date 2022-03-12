/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0; //kilo fiyatları
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double total, armutTotal, elmaTotal, domatesTotal, muzTotal, patlicanTotal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = scan.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = scan.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = scan.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muzKg = scan.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = scan.nextDouble();

        armutTotal = armut * armutKg;
        elmaTotal = elma * elmaKg;
        domatesTotal = domates * domatesKg;
        muzTotal = muz * muzKg;
        patlicanTotal = patlican * patlicanKg;

        total = armutTotal + elmaTotal + domatesTotal + muzTotal + patlicanTotal;
        System.out.println("Toplam Tutar : " + total + " TL");
    }
}
