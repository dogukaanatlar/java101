import java.util.Scanner;

public class Main {
    static int primeNum(int num, int i) {
        if (num==i) {
            System.out.println(num + " sayısı ASALDIR !");
            return 1;
        }else if(num % i == 0) {
            System.out.println(num + " sayısı ASAL değildir !");
            return 1;
        }
        return primeNum(num, ++i);
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        num = scan.nextInt();

        primeNum(num, 2);
    }
}