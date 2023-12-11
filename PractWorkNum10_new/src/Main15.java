import java.io.IOException;
import java.io.InputStreamReader;

public class Main15 {
    public static String amogus(){
        InputStreamReader inner = new InputStreamReader(System.in);
        char a = 0;
        try {
            a = (char)System.in.read();
        } catch (IOException e) {
            return "0";
        }
        int number = a - '0';

        if (number >= 0 && number < 10)
            return amogus() + " " + number;
        else
            return "начало";
    }

    public static void main(String[] args) {
        System.out.println(amogus());
    }
}
