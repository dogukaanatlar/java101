import java.util.Scanner;

public class Main {
    static int pattern(int n, int staticNumber, boolean state) {
        System.out.print(n + " ");

        if (n > 0 && state == true) {
            n -= 5;

        } else {
            state = false;
            n += 5;
        }

        if (n==staticNumber){
            return n;
        }
        return pattern(n, staticNumber, state);
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        n = scan.nextInt();
        System.out.print(pattern(n, n, true));
    }
}