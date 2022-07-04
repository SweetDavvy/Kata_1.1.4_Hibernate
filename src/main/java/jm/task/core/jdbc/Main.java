package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("David", "Pervakov", (byte) 27);
        userService.saveUser("Nikita", "Petrov", (byte) 27);
        userService.saveUser("Sergey", "Shagov", (byte) 28);
        userService.saveUser("Alisa", "Pazdnikova", (byte) 24);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();


    }

}
