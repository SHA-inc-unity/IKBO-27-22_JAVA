//                               Первое задание
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class INNValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        try {
            if (isValidINN(inn)) {
                System.out.println("Ваш номер ИНН верен. Заказ оформлен на: " + fullName);
            } else {
                throw new Exception("Недействительный номер ИНН.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static boolean isValidINN(String inn) {
        // Паттерн для ИНН (10 или 12 знаков)
        Pattern pattern = Pattern.compile("^(\\d{10}|\\d{12})$");
        Matcher matcher = pattern.matcher(inn);

        if (!matcher.matches()) {
            return false; // Неправильная длина ИНН
        }

        // Проверка контрольной суммы для 10-значного ИНН
        if (inn.length() == 10) {
            int[] weights = {2, 4, 10, 3, 5, 9, 4, 6, 8};
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += (inn.charAt(i) - '0') * weights[i];
            }
            int controlDigit = sum % 11;
            if (controlDigit == 10) {
                controlDigit = 0;
            }
            return controlDigit == inn.charAt(9) - '0';
        }

        // Проверка контрольных сумм для 12-значного ИНН
        if (inn.length() == 12) {
            int[] weights1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
            int weights2 = 11;
            int sum1 = 0;
            for (int i = 0; i < 10; i++) {
                sum1 += (inn.charAt(i) - '0') * weights1[i];
            }
            int controlDigit1 = sum1 % 11;
            if (controlDigit1 == 10) {
                controlDigit1 = 0;
            }

            int sum2 = 0;
            for (int i = 0; i < 11; i++) {
                sum2 += (inn.charAt(i) - '0') * weights1[i];
            }
            int controlDigit2 = sum2 % 11;
            if (controlDigit2 == 10) {
                controlDigit2 = 0;
            }

            return controlDigit1 == inn.charAt(10) - '0' && controlDigit2 == inn.charAt(11) - '0';
        }

        return false; // Неправильная длина ИНН
    }

    private static boolean checkINN10Digits(String inn) {
        int[] coeficients = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int controlSum = 0;

        for (int i = 0; i < 9; i++) {
            controlSum += Character.getNumericValue(inn.charAt(i)) * coeficients[i];
        }

        int remainder = controlSum % 11;
        if (remainder == 10) {
            remainder = 0;
        }

        int expectedCheckDigit = Character.getNumericValue(inn.charAt(9));

        return remainder == expectedCheckDigit;
    }

    private static boolean checkINN12Digits(String inn) {
        int[] coeffs1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] coeffs2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

        int controlSum1 = 0;
        int controlSum2 = 0;

        for (int i = 0; i < 10; i++) {
            controlSum1 += Character.getNumericValue(inn.charAt(i)) * coeffs1[i];
            controlSum2 += Character.getNumericValue(inn.charAt(i)) * coeffs2[i];
        }

        int remainder1 = controlSum1 % 11;
        if (remainder1 == 10) {
            remainder1 = 0;
        }

        int remainder2 = controlSum2 % 11;
        if (remainder2 == 10) {
            remainder2 = 0;
        }

        int expectedCheckDigit1 = Character.getNumericValue(inn.charAt(10));
        int expectedCheckDigit2 = Character.getNumericValue(inn.charAt(11));

        return remainder1 == expectedCheckDigit1 && remainder2 == expectedCheckDigit2;
    }
}