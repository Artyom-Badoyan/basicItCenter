package basicIt.lesson2BooksUsersApp.smallProject.model;

public class Book {

    private  String name;
    private int page;
    private int year;
    private User author;

    public Book() {
    }

    public Book(String name, int page, int year, User author) {
        this.name = name;
        this.page = page;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public int getYear() {
        return year;
    }

    public User getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", page=" + page +
                ", year=" + year +
                ", author: " + author.getName() + " " + author.getSurname() +
                '}';
    }
}
