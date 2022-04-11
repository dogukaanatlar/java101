/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
Harmonik seri formülü : 1+(1/2)+(1/3)+(1/4)+(1/5)+...+(1/n)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double total=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        n = scan.nextInt();

        if(n>0){
            for(double i=1; i<=n; i++){
                total += 1/i;
            }
        }else{
            System.out.println("Negatif bir sayı girdiniz.");
        }

        System.out.println(total);
    }
}