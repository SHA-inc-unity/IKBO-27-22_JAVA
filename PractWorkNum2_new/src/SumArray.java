public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int sumFor = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }
        System.out.println("Сумма с использованием цикла for: " + sumFor);

        int sumWhile = 0;
        int j = 0;
        while (j < numbers.length) {
            sumWhile += numbers[j];
            j++;
        }
        System.out.println("Сумма с использованием цикла while: " + sumWhile);

        int sumDoWhile = 0;
        int k = 0;
        do {
            sumDoWhile += numbers[k];
            k++;
        } while (k < numbers.length);
        System.out.println("Сумма с использованием цикла do-while: " + sumDoWhile);
    }
}
