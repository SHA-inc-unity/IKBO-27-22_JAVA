/// Я 28 в группе чтобы не было вопросов
/// тут 17 задач, значит начну с 11й по 15ю

import java.util.Scanner;

public class Main11 {
    public static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            int nextNumber = scanner.nextInt();
            if(nextNumber == 0)
                return 0;
            else if (number == 1)
                return 1 + countOnes();
            else
                return countOnes();
        } else if (number == 1) {
            // Если введен 1, вернуть 1 + результат рекурсивного вызова
            return 1 + countOnes();
        } else {
            // Введено что-то другое, просто продолжаем рекурсию без увеличения счетчика
            return countOnes();
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершите двумя нулями подряд):");
        int totalCount = countOnes();
        System.out.println("Число 1 встречается " + totalCount + " раз.");
    }
}