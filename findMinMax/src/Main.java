import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, number, min = 1, max = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = scan.nextInt();

        for (int i = 1; n >= i; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = scan.nextInt();

            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }

        System.out.println("En Büyük sayı :" + max);
        System.out.println("En Küçük sayı :" + min);
    }
}