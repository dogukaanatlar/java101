/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        String password = "123", name = "dogukaan", userName, userPassword;
        int pickPw;

        System.out.print("Kullanıcı Adınızı giriniz : ");
        userName = scan.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        userPassword = scan.nextLine();

        if ( userName.equals(name) && password.equals(userPassword) ){
            System.out.println("Şifre geçerli!");
        }else{
            System.out.println("Girilen şifre hatalı! / Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1-Evet / 2- Hayır");
            pickPw = scan.nextInt();

            switch (pickPw){
                case (1):
                    System.out.print("Yeni şifreyi giriniz : ");
                    String pwNew = scan1.nextLine();

                    if(pwNew.equals(password)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre değiştirildi.");
                    }
                    break;
                case (2):
                    System.out.println("Şifre değiştirilmedi.");
                    break;
            }
        }
    }
}