import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main12 {
    public static String countOnes() {
        InputStreamReader inner = new InputStreamReader(System.in);
        char a = 0;
        try {
            a = (char)System.in.read();
        } catch (IOException e) {
            return "0";
        }
        int number = a - '0';

        if (number % 2 == 1) {
            String n = countOnes();
            if(n != "0")
                return number + n;
            else
                return String.valueOf(number);
        } else if(number != 0) {
            return countOnes();
        } else{
            return "0";
        }
    }

    public static void main(String[] args) {
        System.out.println(countOnes());
    }
}
