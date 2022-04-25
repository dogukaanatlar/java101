import java.util.Scanner;

public class Main {
    static int power(int num, int pow) {
        if (pow < 1) {
            return 1;
        }
        return num * power(num, --pow);
    }

    public static void main(String[] args) {
        int num, pow;
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        num = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        pow = scan.nextInt();

        System.out.println("Sonuç : " + power(num,pow));
    }
}