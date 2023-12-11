import java.io.IOException;
import java.io.InputStreamReader;

public class Main16 {
    public static String abb(){
        InputStreamReader inner = new InputStreamReader(System.in);
        char a = 0;
        try {
            a = (char)System.in.read();
        } catch (IOException e) {
            return "0";
        }
        int number = a - '0';

        if (number >= 0 && number < 10) {
            String str = abb();
            int intValue = Integer.parseInt(str);
            if (number > intValue % 10){
                return Integer.toString(number + 10);
            }
            else if (number == intValue % 10){
                return Integer.toString(intValue + 10);
            }
            else {
                return Integer.toString(intValue);
            }
        }
        else {
            return "0";
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt(abb()) / 10);
    }
}
