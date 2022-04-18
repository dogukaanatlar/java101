import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, ebob = 0, ekok, k = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        n1 = scan.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        n2 = scan.nextInt();

        k = n1;
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println("EBOB= " + ebob);

        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK= " + ekok);
    }
}