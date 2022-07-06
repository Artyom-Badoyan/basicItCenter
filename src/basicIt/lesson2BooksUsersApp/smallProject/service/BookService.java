package basicIt.lesson2BooksUsersApp.smallProject.service;

import basicIt.lesson2BooksUsersApp.smallProject.model.Book;
import basicIt.lesson2BooksUsersApp.smallProject.model.User;
import basicIt.lesson2BooksUsersApp.smallProject.storages.BookStorage;

public class BookService {
    private final BookStorage bookStorage = new BookStorage();

    public void add(Book book) {
        bookStorage.add(book);
    }

    public Book[] getByUser(User currentUser) {
        return null; //todo call from bookStorage
    }
}
