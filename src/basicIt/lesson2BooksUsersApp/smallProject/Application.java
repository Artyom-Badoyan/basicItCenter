package basicIt.lesson2BooksUsersApp.smallProject;

import basicIt.lesson2BooksUsersApp.smallProject.exception.UserAlreadyException;
import basicIt.lesson2BooksUsersApp.smallProject.exception.UserNotFoundException;
import basicIt.lesson2BooksUsersApp.smallProject.model.Book;
import basicIt.lesson2BooksUsersApp.smallProject.model.User;
import basicIt.lesson2BooksUsersApp.smallProject.service.BookService;
import basicIt.lesson2BooksUsersApp.smallProject.service.UserService;

import java.util.Scanner;

public class Application {

    private UserService userService = new UserService();
    private BookService bookService = new BookService();
    private Scanner scanner = new Scanner(System.in);
    private User currentUser;

    public void start() {
        boolean findNormalCommand = false;
        while (!findNormalCommand) {
            System.out.println("For registration please input 1");
            System.out.println("For login please input 2");
            String command = scanner.nextLine();
            switch (command) {
                case "1": {
                    registration();
                    findNormalCommand = true;
                    break;
                }
                case "2": {
                    login();
                    findNormalCommand = true;
                    break;
                }
                default: {
                    System.out.println("Please input only 1 or 2");
                }
            }

        }
    }

    private void login() {
        System.out.println(" ** Login process **");

        System.out.println("Please input your email");
        String email = scanner.nextLine();

        System.out.println("Please input your password");
        String password = scanner.nextLine();

        try {
            currentUser = userService.login(email, password);
            System.out.println("Login success");
            start();   //removable

        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            start();
        }
    }

    private void registration() {
        System.out.println(" ** Registration process **");

        System.out.println("Please input your name");
        String name = scanner.nextLine();

        System.out.println("Please input your surname");
        String surname = scanner.nextLine();

        System.out.println("Please input your email");
        String email = scanner.nextLine();

        System.out.println("Please input your password");
        String password = scanner.nextLine();
        try {
            currentUser = userService.registration(new User(name, surname, email, password));
            System.out.println("Registration success");
            menu();
        } catch (UserAlreadyException e) {
            System.out.println(e.getMessage());
            start();
        }
    }


    public void menu() {
        boolean normalCommandFind = false;
        while (!normalCommandFind) {
            System.out.println("For add new book press 1");
            System.out.println("For see your books press 2");
            System.out.println("For see all books press 3");
            System.out.println("For logout press 4");
            String command = scanner.nextLine();
            switch (command) {
                case "1": {
                    addNewBook();
                    normalCommandFind = true;
                    break;
                }
                case "2": {
                    printCurrentUserBooks();
                    normalCommandFind = true;
                    break;
                }
                case "3": {
                    printAllBooks();
                    normalCommandFind = true;
                    break;
                }
                case "4": {
                    logOut();
                    normalCommandFind = true;
                    break;
                }
                default: {
                    System.out.println("Please input only 1,2,3,4 numbers");
                    break;
                }
            }
        }
    }


    private void logOut() {
    }

    private void printAllBooks() {
       
    }

    private void printCurrentUserBooks() {
        Book[] books = bookService.getByUser(currentUser);
        for (Book book : books) {
            System.out.println();
        }
    }

    private void addNewBook() {
        System.out.println("*** Add book process ***");

        System.out.println("Input book name");
        String name = scanner.nextLine();
        int page = defineNumberValue("Please input book page");
        int year = defineNumberValue("Pleas input book year");
        bookService.add(new Book(name, page, year, new User(currentUser)));
        System.out.println("Your book added");
        menu();


    }

    private int defineNumberValue(String text) {
        int page = 0;
        boolean isNumberDefined = false;
        while (!isNumberDefined) {
            try {
                System.out.println(text);
                scanner = new Scanner(System.in);
                page = Integer.parseInt(scanner.nextLine());
                isNumberDefined = true;
            } catch (Exception e) {
                System.out.println("Please input only numeric value");
            }
        }
        return page;
    }
}
