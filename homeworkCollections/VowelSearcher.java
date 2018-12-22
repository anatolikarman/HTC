package homeworkCollections;

public class VowelSearcher {
    private static String[] vowels = {"а", "о", "у", "э", "ы", "и", "ю"};

    public static void searchForVowels(Shelf a) {
        System.out.println();
        System.out.println("Vowel searcher is on the case");
        System.out.println();
        for (Book book : a.getShelf()) {
            for (String str : vowels) {
                if (book.getBookName().toLowerCase().startsWith(str)) {
                    System.out.println(book);

                }
            }
        }
    }
}
