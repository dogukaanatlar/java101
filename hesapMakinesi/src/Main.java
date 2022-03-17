// Hesap makinesini switch-case kullanarak yapınız.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,pick,toplam,cikart,carp,bol;
        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = scan.nextInt();

        System.out.println("Yapmak istediğiniz işlem için seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        pick = scan.nextInt();

        switch (pick){
            case 1:
                toplam = n1 + n2;
                System.out.println( n1 + " + " + n2 + " = " + toplam);
                break;
            case 2:
                cikart = n1 - n2;
                System.out.println( n1 + " - " + n2 + " = " + cikart);
                break;
            case 3:
                carp = n1 * n2;
                System.out.println( n1 + " * " + n2 + " = " + carp);
                break;
            case 4:
                if( n2==0 ){
                    System.out.println("Sayı sıfıra bölünmez!");
                }
                else{
                bol = n1 / n2;
                System.out.println( n1 + " / " + n2 + " = " + bol);
                }
                break;
            default:
                System.out.print("Geçersiz bir işlem girdiniz!");
                break;
        }
    }
}