import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean isValidKey = false;

        do {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                isValidKey = true; // Если ввод корректен, выходим из цикла
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
                myScanner.nextLine(); // Очищаем буфер ввода
            }
        } while (!isValidKey);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to an empty string");
        }
        return "Data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
