import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3, balance = 1500, pick, price;

        System.out.print("Kullanıcı adını giriniz : ");
        userName = scan.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = scan.nextLine();

        myLoop: //case4 ve default break komutları için kullanılmıştır
        while (right > 0) {
            if (userName.equals("dogukaan") && password.equals("123")) {
                System.out.println("Siteme giriş yaptınız.");
                System.out.println("1- Para Yatırma\n" +
                        "2- Para Çekme\n" +
                        "3- Bakiye Sorgula\n" +
                        "4- Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                pick = scan.nextInt();

                switch (pick) {
                    case 1 -> {
                        System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                        price = scan.nextInt();
                        balance += price;
                        System.out.println("Bakiyeniz : " + balance + "TL");
                    }
                    case 2 -> {
                        System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                        price = scan.nextInt();

                        if (price > balance) {
                            System.out.println("Yetersiz bakiye.");
                        } else {
                            balance -= price;
                            System.out.println("Bakiyeniz : " + balance + "TL");
                        }
                    }
                    case 3 -> System.out.println("Bakiyeniz : " + balance + "TL");
                    case 4 -> {
                        System.out.println("Çıkış yapılıyor.");
                        break myLoop;
                    }
                    default -> {
                        System.out.println("Geçersiz işlem");
                        break myLoop;
                    }
                }
            } else {
                right--;
                System.out.println("Hatalı giriş. Kullanıcı adı ve şifre yanlış. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}