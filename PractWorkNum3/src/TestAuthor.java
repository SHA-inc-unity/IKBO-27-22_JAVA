class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Tolik Serov", "tlSerov@somewhere.com", 'M');
        Author author2 = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'F');

        System.out.println(author1.toString());
        System.out.println(author2.toString());

        System.out.println("Author name: " + author1.getName());
        System.out.println("Author email: " + author1.getEmail());
        System.out.println("Author gender: " + author1.getGender());
    }
}
