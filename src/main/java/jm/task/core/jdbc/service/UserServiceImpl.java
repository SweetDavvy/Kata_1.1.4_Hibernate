package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
//    UserDao userDao = new UserDaoJDBCImpl();
    UserDao userDao = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
        System.out.println("The table of users have been removed.");
    }

    public void saveUser(String name, String lastname, byte age) {
        userDao.saveUser(name, lastname, age);
        System.out.println("User name: " + name + " " + lastname + " " + " added to database");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        System.out.println("User with id: " + id + " removed");
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = userDao.getAllUsers();
        System.out.println("All users from table 'users':");
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
        System.out.println("The table of users have been cleaned.");
    }
}
