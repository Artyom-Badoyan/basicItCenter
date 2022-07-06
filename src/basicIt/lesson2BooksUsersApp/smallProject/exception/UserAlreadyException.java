package basicIt.lesson2BooksUsersApp.smallProject.exception;

public class UserAlreadyException extends Exception{

    private  String message;

    public UserAlreadyException(String message){
        super(message);
        this.message = message;
    }
}
