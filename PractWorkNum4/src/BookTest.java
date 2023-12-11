public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Автор книги", "Название книги", 2023);

        System.out.println("Автор книги: " + book.getAuthor());
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());

        // Изменение данных книги и повторное отображение
        book.setAuthor("Новый автор");
        book.setTitle("Новое название");
        book.setYear(2024);

        System.out.println("Новый автор книги: " + book.getAuthor());
        System.out.println("Новое название книги: " + book.getTitle());
        System.out.println("Новый год написания: " + book.getYear());
    }
}
