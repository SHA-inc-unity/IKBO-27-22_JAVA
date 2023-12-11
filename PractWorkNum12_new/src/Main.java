
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> player1Deck = new ArrayList<>();
        ArrayList<Integer> player2Deck = new ArrayList<>();

        System.out.println("введите свои карты (10 значений от 0 до 9 без пробелов):");
        String input1 = scanner.next();
        for (int i = 0; i < 5; i++) {
            int card = Character.getNumericValue(input1.charAt(i));
            player1Deck.add(card);
        }
        String input2 = scanner.next();
        for (int i = 0; i < 5; i++) {
            int card = Character.getNumericValue(input2.charAt(i));
            player2Deck.add(card);
        }

        int rounds = 0;

        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && rounds < 106) {
            int card1 = player1Deck.remove(0);
            int card2 = player2Deck.remove(0);

            System.out.println("Раунд " + (rounds + 1) + ": Игрок 1 (" + card1 + ") vs Игрок 2 (" + card2 + ")" + player1Deck.size() + "/" + player2Deck.size());

            if(player1Deck.isEmpty() || player2Deck.isEmpty())
                break;
            if (card1 > card2) {
                player1Deck.add(card1);
                player1Deck.add(card2);
            } else {
                player2Deck.add(card1);
                player2Deck.add(card2);
            }

            rounds++;
        }

        if(rounds == 106){
            System.out.println("botva");
        }
        else if (player1Deck.isEmpty()) {
            System.out.println("second " + rounds + 1);
        } else {
            System.out.println("first " + rounds + 1);
        }
    }
}