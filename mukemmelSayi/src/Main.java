import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }

        if (total == n) {
            System.out.println(n + " Mükemmel sayıdır.");
        } else {
            System.out.println(n + " Mükemmel sayı değildir.");
        }

    }
}