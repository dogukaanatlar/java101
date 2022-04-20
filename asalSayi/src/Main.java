public class Main {
    public static void main(String[] args) {
        int number;

        for (number = 2; number <= 100; number++) {
            int status = 1;

            for (int div = 2; div < number; div++) {
                if (number % div == 0) {
                    status = 0;
                    break;
                }
            }
            if (status == 1) {
                System.out.print(number + " ");
            }
        }
    }
}