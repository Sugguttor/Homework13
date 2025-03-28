public class App {
    public static void main(String[] args) {

        Author author = new Author("Lev", "Tolstoy");
        Author secondAuthor = new Author("Nick", "Perumov");

        Book book = new Book("Anna Karenina", author, 1875);
        Book secondBook = new Book("DeathOfGods", secondAuthor, 1994);
        book.setYearOfBook(1876);
    }
}
