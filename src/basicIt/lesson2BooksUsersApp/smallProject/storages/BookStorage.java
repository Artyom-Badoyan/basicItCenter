package basicIt.lesson2BooksUsersApp.smallProject.storages;

import basicIt.lesson2BooksUsersApp.smallProject.model.Book;

public class BookStorage {

        private Book[] books = new Book[10];

        private int size = 0;

        public void add(Book book) {
            if (size >= books.length) {
                extend();
                books[size] = book;
                size++;
            }
        }

        private void extend() {
            Book[] newUserList = new Book[books.length + 5];
            for (int i = 0; i < books.length; i++) {
                newUserList[i] = books[i];
            }
            books = newUserList;
        }

    }


