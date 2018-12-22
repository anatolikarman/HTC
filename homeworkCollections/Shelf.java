package homeworkCollections;

import java.util.*;

public class Shelf {
    private static String[] poolOfBookNames = {"Государь", "Фауст", "Атлант расправил плечи"};
    private static String[] poolOfAuthorNames = {"Ханна", "Иоган", "Никколо", "Сергей"};
    private static String[] poolOfAuthorDaddyNames = {"Григорьевич", "Бедросович", "Артемьевич"};
    private static String[] poolOfAuthorSecondNames = {"Арендт", "Жадан", "Макиавелли", "Гёте"};
    HashSet<Book> shelf = new HashSet<>();

    public Shelf() {
        Random rand = new Random();
        int shelfSize = 26;

        for (int i = 0; i < shelfSize; i++) {
            shelf.add(new Book(poolOfBookNames[rand.nextInt(poolOfBookNames.length)],
                    poolOfAuthorNames[rand.nextInt(poolOfAuthorNames.length)],
                    poolOfAuthorDaddyNames[rand.nextInt(poolOfAuthorDaddyNames.length)],
                    poolOfAuthorSecondNames[rand.nextInt(poolOfAuthorSecondNames.length)]));
        }

        for (Book book : shelf) {
            System.out.println(book);

        }

    }

    public HashSet<Book> getShelf() {
        return shelf;
    }

    public void setShelf(HashSet<Book> shelf) {
        this.shelf = shelf;
    }
}
