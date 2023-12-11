import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleList {
    private Node head;
    private Node tail;

    public DoubleList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DoubleList player1Deck = new DoubleList();
        DoubleList player2Deck = new DoubleList();

        System.out.println("Игрок 1, введите свои карты (10 значений от 0 до 9 без пробелов):");
        String input1 = scanner.next();
        for (int i = 0; i < 5; i++) {
            int card = Character.getNumericValue(input1.charAt(i));
            player1Deck.addLast(card);
        }
        String input2 = scanner.next();
        for (int i = 0; i < 5; i++) {
            int card = Character.getNumericValue(input2.charAt(i));
            player2Deck.addLast(card);
        }

        int rounds = 0;

        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && rounds < 106) {
            int card1 = player1Deck.removeFirst();
            int card2 = player2Deck.removeFirst();

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
