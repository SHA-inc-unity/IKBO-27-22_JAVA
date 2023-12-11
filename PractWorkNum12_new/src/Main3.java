import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> player1Deck = new ArrayDeque<>();
        Deque<Integer> player2Deck = new ArrayDeque<>();

        System.out.println("Игрок 1, введите свои карты (10 значений от 0 до 9 без пробелов):");
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
            int card1 = player1Deck.poll();
            int card2 = player2Deck.poll();

            System.out.println("Раунд " + (rounds + 1) + ": Игрок 1 (" + card1 + ") vs Игрок 2 (" + card2 + ") " + player1Deck.size() + "/" + player2Deck.size());

            if (player1Deck.isEmpty() || player2Deck.isEmpty())
                break;
            if (card1 > card2) {
                player1Deck.addLast(card1);
                player1Deck.addLast(card2);
            } else {
                player2Deck.addLast(card1);
                player2Deck.addLast(card2);
            }

            rounds++;
        }

        if (rounds == 106) {
            System.out.println("Ботва!");
        } else if (player1Deck.isEmpty()) {
            System.out.println("Игрок 2 выиграл после " + (rounds + 1) + " раундов!");
        } else {
            System.out.println("Игрок 1 выиграл после " + (rounds + 1) + " раундов!");
        }
    }
}
