import java.io.IOException;
import java.io.InputStreamReader;

public class Main13 {
    public static String count135() {
        InputStreamReader inner = new InputStreamReader(System.in);
        char a = 0;
        try {
            a = (char)System.in.read();
            while (a == 10 || a == -38) {
                a = (char) System.in.read();
            }
        } catch (IOException e) {
            return "0";
        }
        int number = a - '0';

        String n = "";
        if (number != 0){
            n = number + n;
            try {
                a = (char) System.in.read();
                while (a == 10 || a == -38) {
                    a = (char) System.in.read();
                }
            } catch (IOException e) {
                return "0";
            }
            number = a - '0';
            if(number > 0 && number < 10){
                return n + count135();
            }
            else {
                return n;
            }
        }
        else{
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(count135());
    }
}
