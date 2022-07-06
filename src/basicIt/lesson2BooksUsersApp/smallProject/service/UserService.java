package basicIt.lesson2BooksUsersApp.smallProject.service;

import basicIt.lesson2BooksUsersApp.smallProject.model.User;
import basicIt.lesson2BooksUsersApp.smallProject.exception.UserAlreadyException;
import basicIt.lesson2BooksUsersApp.smallProject.exception.UserNotFoundException;
import basicIt.lesson2BooksUsersApp.smallProject.storages.UserStorage;

public class UserService {

    private final UserStorage suerStorage = new UserStorage();

    public User login(String email, String password) throws UserNotFoundException {
        User user = suerStorage.getByEmailAndPassword(email, password);
        if (user == null)
            throw new UserNotFoundException(String.format("User with email = %s and password = %s not found",
                    email, password));
        return user;
    }

    public User registration(User user) throws UserAlreadyException {
        boolean exist = suerStorage.existByEmail(user.getEmail());
        if (exist)
            throw new UserAlreadyException(String.format("User with email = %s already exist", user.getEmail()));
        suerStorage.add(user);
        return user;
    }
}
