import java.util.Scanner;

public class MineSweeper {
    Scanner scan = new Scanner(System.in);
    int rowMax, colMax;//haritanın sınırları
    int row, col;//kullanıcıdan alınacak olan nok
    int mineNum;//mayın sayısı
    String[][] gameMap;// oyun haritası
    String[][] mineMap;//mayın haritası
    boolean check = true;
    int count; //nokta etrafındaki mayın sayacı

    public MineSweeper(int row, int col) {
        this.rowMax = row;
        this.colMax = col;
        this.mineNum = ((col * row) / 4);
        this.gameMap = new String[col][row];
        this.mineMap = new String[col][row];
    }

    public void setupMap() {
        //maplere "-" atamak
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                gameMap[i][j] = "-";
                mineMap[i][j] = "-";
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println("");
        }
        //mineMap'e random mayın ataması
        for (int i = 0; i < mineNum; i++) {
            int a = (int) (Math.random() * this.rowMax);
            int b = (int) (Math.random() * this.colMax);
            if (mineMap[a][b].equals("*")) {
                i--; //eğer yıldız varsa tekrar dön
            }
            mineMap[a][b] = "*";
        }
    }

    public void scanMine() { //kullanıcıdan nokta almak
        check = false;
        System.out.println("=============");
        System.out.print("Satır Giriniz : ");
        row = scan.nextInt();
        System.out.print("\bSütun Giriniz : ");
        col = scan.nextInt();

        while (!check) {
            if (0 <= row && 0 <= col && row < this.rowMax && col < this.colMax) {
                check = true;
            } else {
                System.out.println("Harita dışında bir nokta seçtiniz! Tekrar Satır ve Sütun giriniz.");
                System.out.print("Satır Giriniz : ");
                row = scan.nextInt();
                System.out.print("\bSütun Giriniz : ");
                col = scan.nextInt();
            }
        }
    }

    public void mineCount() { //seçilen nokta etrafındaki mayınları saymak ve yazmak için
        count = 0;
        for (int i = (row - 1); i <= (row + 1); i++) {//nokta etrafındaki mayını saymak
            for (int j = (col - 1); j <= (col + 1); j++) {

                if ((i < 0 || j < 0 || i >= this.rowMax || j >= this.colMax)) {
                    continue;
                } else {
                    if (mineMap[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }

        gameMap[row][col] = String.valueOf(count); //gamemap'e etrafındaki mayın sayısını yazdırmak. Ekranda görebilmek için
        mineMap[row][col] = String.valueOf(count); //mineMap'e sayıları yazdırmak. sonrasında "-" kontrolü(finishCheck) yaparak oyunu bitirmek
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void writeMineMap() { //mayınların bulunduğu map yazdırmak
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                System.out.print(mineMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finishCheck() { //gameMap üzerinde "-" var mı kontrolü
        for (int i = 0; i < this.rowMax; i++) {
            for (int j = 0; j < this.colMax; j++) {
                if (mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void run() {
        setupMap();

        while (check) {
            scanMine();
            if (mineMap[row][col].equals("*")) {
                System.out.println("Game Over!");
                writeMineMap();
                check = false;
                //break;
            } else {
                mineCount();
                if (finishCheck()) {
                    System.out.println("Tebrikler kazandınız! Mayınların yerleri : ");
                    writeMineMap();
                    check = false;
                }
            }
        }
    }
}