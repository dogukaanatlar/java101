/*
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c, sum=0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz : ");
            c = scan.nextInt();
            if (c%4 == 0 || c%2 == 0){
                sum += c;
            }
        }while (c%2 == 0);

        System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıları toplamı = "+ sum);
    }
}