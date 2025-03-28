import java.util.Objects;

public class Book {

    String nameOfBook;
    Author authorOfBook;
    int yearOfBook;

    public Book(String nameOfBook, Author authorOfBook, int yearOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.yearOfBook = yearOfBook;
    }

    public String toString() {
        return nameOfBook + " " + authorOfBook + " " + yearOfBook;
    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public Author getAuthorOfBook() {
        return this.authorOfBook;
    }

    public int getYearOfBook() {
        return this.yearOfBook;
    }

    public void setYearOfBook(int yearOfBook) {
        this.yearOfBook = yearOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfBook == book.yearOfBook && Objects.equals(nameOfBook, book.nameOfBook) && Objects.equals(authorOfBook, book.authorOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, authorOfBook, yearOfBook);

    }
}

