package ClassesAndObjects.Task12to16;

public class Book implements Cloneable,Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(){
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }
    public Book(String title, String author, int price, int edition, int isbn){
        this.title=title;
        this.author=author;
        this.price=price;
        this.edition=edition;
        this.isbn=isbn;
    }
    @Override

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        boolean compare= (title==book.title)&&(author==book.author)&&(price==book.price)&&(edition==book.edition);
        return compare;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + price;
        result = prime * result + edition;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Book [title=" + title
                + ", author=" + author
                + ", price=" + price
                +  "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int compareTo(Book book){
        return isbn-book.isbn;
    }
}

