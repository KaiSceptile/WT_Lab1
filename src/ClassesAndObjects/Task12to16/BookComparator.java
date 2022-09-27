package ClassesAndObjects.Task12to16;

import java.util.Comparator;

public class BookComparator {
    public static Comparator<Book> byTitle = (a, b) -> {
        return a.getTitle().compareToIgnoreCase(b.getTitle());
    };
    public static Comparator<Book> byAuthorandTitle = (a, b) -> {
        int checkauthor= a.getAuthor().compareToIgnoreCase(b.getAuthor());
        if (checkauthor!=0) {return checkauthor;}
        else return a.getTitle().compareToIgnoreCase(b.getTitle());
    };
    public static Comparator<Book> byTitleandAuthor = (a, b) -> {
        int checktitle= a.getTitle().compareToIgnoreCase(b.getTitle());
        if (checktitle!=0) {return checktitle;}
        else return a.getAuthor().compareToIgnoreCase(b.getAuthor());
    };
    public static Comparator<Book> byAuthorandTitleandPrice = (a, b) -> {
        int checkauthor= a.getAuthor().compareToIgnoreCase(b.getAuthor());
        int checktitle= a.getTitle().compareToIgnoreCase(b.getTitle());
        if (checkauthor!=0) {return checkauthor;}
        else if (checktitle!=0) {return checktitle;}
        else return a.getPrice()-b.getPrice();
    };
}