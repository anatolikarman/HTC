package homeworkCollections;

import homeworkCollections.Comparator.AuthorNameComparator;
import homeworkCollections.Comparator.TransportComparator;

import java.util.TreeSet;

public class Sorter {
    private static TreeSet<Book> authorNameSet = new TreeSet<>(new AuthorNameComparator());
    ;
    private static TreeSet<Book> authorSecondNameSet = new TreeSet<>();
    private static TreeSet<Book> authorDaddyNameSet = new TreeSet<>();
    private static TreeSet<Book> basicSet = new TreeSet<>(new TransportComparator());

    public static void sortByAN(Shelf a) {
        System.out.println();
        System.out.println("Сортируем по Имени Автора");
        System.out.println();
        basicSet.addAll(a.getShelf());
        authorNameSet.addAll(basicSet);
        authorNameSet.forEach(System.out::println);


    }

}
