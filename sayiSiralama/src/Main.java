/*
Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sıralamak istediğiniz sayıları giriniz.");
        System.out.print("1. sayı : ");
        a = scan.nextInt();
        System.out.print("2. sayı : ");
        b = scan.nextInt();
        System.out.print("3. sayı : ");
        c = scan.nextInt();

        if((a<b) && (a<c)){
            if (b<c){
                System.out.println("Küçükten büyüğe sıralama : " + a + " < " + b + " < " + c + " dir");
                System.out.println("a < b < c");
            }else{
                System.out.println("Küçükten büyüğe sıralama : " + a + " < " + c + " < " + b + " dir");
                System.out.println("a < c < b");
            }
        }else if((b<a) && (b<c)){
            if (a<c){
                System.out.println("Küçükten büyüğe sıralama : " + b + " < " + a + " < " + c + " dir");
                System.out.println("b < a < c");
            }else{
                System.out.println("Küçükten büyüğe sıralama : " + b + " < " + c + " < " + a + " dir");
                System.out.println("b < c < a");
            }
        }else {
            if (a<b){
                System.out.println("Küçükten büyüğe sıralama : " + c + " < " + a + " < " + b + " dir");
                System.out.println("c < a < b");
            }else{
                System.out.println("Küçükten büyüğe sıralama : " + c + " < " + b + " < " + a + " dir");
                System.out.println("c < b < a");
            }
        }
    }
}
