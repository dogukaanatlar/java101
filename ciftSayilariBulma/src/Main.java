/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        double average, sum=0, count=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        a = scan.nextInt();

        for(int i=1; i <= a; i++){
            if( i % 3 == 0 || i % 4 == 0 ) {
                sum = sum + i;
                count++;
            }
        }

        average = sum / count;
        System.out.println("Girilen sayıya kadar olan sayılardan 3'e ve 4'e tam bölünen sayıların ortalaması = "+ average);
    }
}
