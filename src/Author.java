import java.util.Objects;

public class Author {
    String nameOfAuthor;
    String surnameOfAuthor;

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        this.surnameOfAuthor = surnameOfAuthor;
    }

    public String getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public String getSurnameOfAuthor() {
        return this.surnameOfAuthor;
    }

    public String toString() {
        return nameOfAuthor + " " + surnameOfAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameOfAuthor, author.nameOfAuthor) && Objects.equals(surnameOfAuthor, author.surnameOfAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, surnameOfAuthor);

    }
}
