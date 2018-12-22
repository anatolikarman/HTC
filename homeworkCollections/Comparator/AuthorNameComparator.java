package homeworkCollections.Comparator;

import homeworkCollections.Book;

import java.util.Comparator;

public class AuthorNameComparator implements Comparator<Book> {

    public int compare(Book o1, Book o2) {

        return o1.getAuthorName().compareTo(o2.getAuthorName());

    }

}
