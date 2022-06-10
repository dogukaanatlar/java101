import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scan.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < list.length; i++) {
            int count = i;
            System.out.print(++count + ". Elemanı : ");
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);//kücükten büyüge sıralama

        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}