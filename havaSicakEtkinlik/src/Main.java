/*
Koşullar :
-Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
-Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
-Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
-Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz : ");
        heat = scan.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(heat <= 25){ //5 <= heat && heat <= 25
            if (heat <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
