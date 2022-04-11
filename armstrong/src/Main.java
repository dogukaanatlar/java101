/*
Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, a, total=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        number = scan.nextInt();

        if(number>0){
            while(number !=0 ){
                a = number % 10;
                total += a;
                number /= 10;
            }
        }else {
            System.out.println("Negatif bir sayı girdiniz.");
        }
        System.out.println("Basamak sayıları toplamı = " + total);
    }
}