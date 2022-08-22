import java.util.Scanner;

public class Main {
    static void plus(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Toplama işlemi sonucu : " + result);
    }

    static void minus(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Çıkartma işlemi sonucu : " + result);
    }

    static void times(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Çarpma işlemi sonucu : " + result);
    }

    static void divided(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Böleni 0 giremezsiniz.");
            return;
        }
        int result = n1 / n2;
        System.out.println("Bölme işlemi sonucu : " + result);
    }

    static void power(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        System.out.println(n1 + "^" + n2 + " = " + result);
    }

    static void factorial(int n1) {
        int result = 1;
        for (int i = 1; i <= n1; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel işlemi sonucu : " + result);
    }

    static void mod(int n1, int n2) {
        int result = n1 % n2;
        System.out.println("Mod işlemi sonucu : " + result);
    }

    static void rectangle(int n1, int n2) {
        int perimeter, area;
        perimeter = 2 * (n1 + n2);
        area = n1 * n2;
        System.out.println("Dikdörgen'in Çevresi : " + perimeter);
        System.out.println("Dikdörgen'in Alanı : " + area);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select, n1, n2;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            if(select==0){
                break;
            }
            System.out.print("1. sayı : ");
            n1 = scan.nextInt();
            System.out.print("2. sayı : ");
            n2 = scan.nextInt();

            switch (select) {
                case 1:
                    plus(n1, n2);
                    break;
                case 2:
                    minus(n1, n2);
                    break;
                case 3:
                    times(n1, n2);
                    break;
                case 4:
                    divided(n1, n2);
                    break;
                case 5:
                    power(n1, n2);
                    break;
                case 6:
                    factorial(n1);
                    break;
                case 7:
                    mod(n1, n2);
                    break;
                case 8:
                    rectangle(n1, n2);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

    }
}