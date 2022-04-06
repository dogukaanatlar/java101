/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,n=0,m=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        k = scan.nextInt();

        for (int i=1; i<=k; i*=4){
            System.out.println("4'ün "+n+ ". kuvveti "+i+ " 'dir");
            n++;
        }
        for (int j=1; j<=k; j*=5){
            System.out.println("5'in "+m+ ". kuvveti "+j+ " 'dir");
            m++;
        }
    }
}