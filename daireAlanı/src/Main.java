/*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14, area;
        int radius,angle;

        System.out.print("Dairenin alanının hesaplanması için yarıçap giriniz : ");
        radius = scan.nextInt();
        System.out.print("Dairenin alanının hesaplanması için açı giriniz : ");
        angle = scan.nextInt();

        //area = pi * radius * radius;
        //double perimeter = 2 * pi * radius;
        area = (pi * (radius*radius)) * angle / 360;

        System.out.println("Yarıçapı : " + radius + " açısı : " + angle + "° olan dairenin alanı : " + area);
        //System.out.println("Yarıçapı " + radius + " olan dairenin çevresi : " + perimeter);
    }
}