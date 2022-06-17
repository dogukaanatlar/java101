import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100); //int türünde 100e kadar random üretme
        //double number = (int) (Math.random() * 100); //1-100 arası random üret - int türüne çevirerek

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Lütfen Tahmininizi Giriniz : ");
            selected = scan.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 aralığında bir sayı giriniz.");
                if (isWrong) {
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5 - (++right)));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı giriş yaptığınızda hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler! Sayıyı doğru tahmin ettiniz. Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Yanlış tahminde bulundunuz. Tekrar deneyin.");
                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan Büyüktür!");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan Küçüktür!");
                }
                wrong[right++] = selected; // right++; tek satır kullanım
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz! ");
            System.out.println("Tahminzleriniz : " + Arrays.toString(wrong));
            System.out.println("Doğru cevap : " + number);
        }
    }
}