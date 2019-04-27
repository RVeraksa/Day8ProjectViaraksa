package by.javatr.task1.util;

import by.javatr.task1.exception.BookInitializationException;

public class Book {
    private String title;
    private String author;
    private double price;
    private int pages;
    {
        title = "NoSetting";
        author = "NoSetting";
        price = -1;
        pages = -1;
    }

    public Book(){}

    public Book(Book book) throws BookInitializationException {
        setTitle(book.title);
        setAuthor(book.author);
        setPrice(book.price);
        setPages(book.pages);
    }

    public Book(String title, String author, double price, int pages) throws BookInitializationException {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setPages(pages);
    }

    public Book(String title) throws BookInitializationException {
        setTitle(title);
    }

    public Book(String title, String author) throws BookInitializationException {
        setTitle(title);
        setAuthor(author);
    }

    public void setTitle(String title) throws BookInitializationException {
        if(title == null){
            throw new BookInitializationException("Title is not set");
        }
        this.title = title;
    }

    public void setAuthor(String author) throws BookInitializationException {
        if(title == null){
            throw new BookInitializationException("Title is not set");
        }
        this.author = author;
    }

    public void setPrice(double price) throws BookInitializationException {
        if(price <= 0){
            throw new BookInitializationException("Invalid price");
        }
        this.price = price;
    }

    public void setPages(int pages) throws BookInitializationException {
        if (pages <= 0){
            throw new BookInitializationException("No pages in book");
        }
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        String temp = "Book[title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price= $" + price +
                ", pages=" + pages + ']';
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if ((price != book.price) && (pages != book.pages)) return false;
        if (null == title){
            return (title == book.title);
        }
        else if (!title.equals(book.title)) return false;
        if (null == author){
            return (author == book.author);
        }
        else if (!author.equals(book.author)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + title.hashCode()
                + author.hashCode() +
                + pages
                + (int) price;
        return result;
    }
}
