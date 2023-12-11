import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Записать в файл");
            System.out.println("2. Вывести содержимое файла");
            System.out.println("3. Заменить текст в файле");
            System.out.println("4. Добавить текст в конец файла");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистить буфер после считывания числа

            switch (choice) {
                case 1:
                    System.out.print("Введите текст для записи в файл: ");
                    String inputText = scanner.nextLine();
                    writeToFile("example.txt", inputText);
                    break;
                case 2:
                    System.out.println("Содержимое файла:");
                    readFromFile("example.txt");
                    break;
                case 3:
                    System.out.print("Введите текст, который нужно заменить: ");
                    String oldText = scanner.nextLine();
                    System.out.print("Введите новый текст: ");
                    String newText = scanner.nextLine();
                    replaceInFile("example.txt", oldText, newText);
                    break;
                case 4:
                    System.out.print("Введите текст для добавления в конец файла: ");
                    String appendText = scanner.nextLine();
                    appendToFile("example.txt", appendText);
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    // Метод для записи текста в файл
    private static void writeToFile(String filename, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(text);
            System.out.println("Текст успешно записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для чтения текста из файла и вывода его на экран
    private static void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для замены текста в файле
    private static void replaceInFile(String filename, String oldText, String newText) {
        try {
            String fileContent = new String();
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while ((line = reader.readLine()) != null) {
                fileContent += line + System.lineSeparator();
            }
            reader.close();

            fileContent = fileContent.replaceAll(oldText, newText);

            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(fileContent);
            writer.close();
            System.out.println("Текст успешно заменен в файле.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для добавления текста в конец файла
    private static void appendToFile(String filename, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(text);
            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
