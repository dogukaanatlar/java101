import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        n = scan.nextInt();

        if (isPalindrom(n)) {
            System.out.println("Girilen sayı Palindrom'dur.");
        } else {
            System.out.println("Girilen sayı Palindrom değildir.");
        }
    }
}