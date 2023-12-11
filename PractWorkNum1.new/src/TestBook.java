
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Mike", "Jo", 3);
        Book d2 = new Book("Helen", "Lin", 7);
        Book d3 = new Book("Bob", "Andrew"); d3.setPages(12);
        System.out.println(d1);
        d1.OutInfoString();
        d2.OutInfoString();
        d3.OutInfoString();
    }
}