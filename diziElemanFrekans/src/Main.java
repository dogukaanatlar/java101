import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[list.length];
        int visited = -1;
        System.out.println("Dizi : " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    frequency[j] = visited;
                    count++;
                }
            }

            if (frequency[i] != visited) {
                frequency[i] = count;
            }
        }

        System.out.println("Tekrar sayıları :");
        for (int i = 0; i < list.length; i++) {
            if (frequency[i] != visited) {
                System.out.println(list[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
            }
        }
    }
}