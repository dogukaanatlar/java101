public class Main {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5};
        double sum = 0;

        for (double i : list) {
            sum += (1 / i);
        }

        double avarage = list.length / sum;
        System.out.println("Ortalama : " + avarage);
    }
}