
import java.util.Stack;
import java.util.Scanner;

public class Main1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Stack<Integer> player1Deck = new Stack<>();
            Stack<Integer> player2Deck = new Stack<>();

            System.out.println("Игрок 1, введите свои карты (10 значений от 0 до 9 без пробелов):");
            String input1 = scanner.next();
            for (int i = 0; i < 5; i++) {
                int card = Character.getNumericValue(input1.charAt(i));
                player1Deck.push(card);
            }
            String input2 = scanner.next();
            for (int i = 0; i < 5; i++) {
                int card = Character.getNumericValue(input2.charAt(i));
                player2Deck.push(card);
            }

            int rounds = 0;

            while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && rounds < 106) {
                int card1 = player1Deck.pop();
                int card2 = player2Deck.pop();

                System.out.println("Раунд " + (rounds + 1) + ": Игрок 1 (" + card1 + ") vs Игрок 2 (" + card2 + ") " + player1Deck.size() + "/" + player2Deck.size());

                if(player1Deck.isEmpty() || player2Deck.isEmpty())
                    break;
                if (card1 > card2) {
                    player1Deck.add(0, card1);
                    player1Deck.add(0, card2);
                } else {
                    player2Deck.add(0, card1);
                    player2Deck.add(0, card2);
                }

                rounds++;
            }

            if (rounds == 106) {
                System.out.println("Ботва!");
            } else if (player1Deck.isEmpty()) {
                System.out.println("Игрок 2 выиграл после " + rounds + 1 + " раундов!");
            } else {
                System.out.println("Игрок 1 выиграл после " + rounds + 1 + " раундов!");
            }
        }

}
