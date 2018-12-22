package homeworkCollections;

import java.util.Objects;

public class Book implements Comparable{
    private String bookName;
    private String authorName;
    private String authorDaddyName;
    private String authorSecondName;

    public Book() {
    }

    public Book(String bookName, String authorName, String authorDaddyName, String authorSecondName) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorDaddyName = authorDaddyName;
        this.authorSecondName = authorSecondName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDaddyName() {
        return authorDaddyName;
    }

    public void setAuthorDaddyName(String authorDaddyName) {
        this.authorDaddyName = authorDaddyName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorDaddyName, book.authorDaddyName) &&
                Objects.equals(authorSecondName, book.authorSecondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, authorDaddyName, authorSecondName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorDaddyName='" + authorDaddyName + '\'' +
                ", authorSecondName='" + authorSecondName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
