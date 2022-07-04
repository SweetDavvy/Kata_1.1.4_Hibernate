package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
//    Util util = new Util();

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//        try {
//            Connection connection = util.getConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users " +
//                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), lastname VARCHAR(255), age INT)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void dropUsersTable() {
//        try {
//            Connection connection = util.getConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("DROP TABLE IF EXISTS users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        String query = "INSERT INTO users (name, lastname, age) VALUES (?, ?, ?)";
//        PreparedStatement preparedStatement = null;
//        try {
//            Connection connection = util.getConnection();
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {
//        String query = "DELETE FROM users WHERE id = ?";
//        PreparedStatement preparedStatement = null;
//        try {
//            Connection connection = util.getConnection();
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        String query = "select * from users";
//        try (Statement statement = util.getConnection().createStatement()) {
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()) {
//                User user = new User(resultSet.getString("name"),
//                        resultSet.getString("lastname"), resultSet.getByte("age"));
//                user.setId(resultSet.getLong("id"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return users;

        return null;
    }

    public void cleanUsersTable() {
//        try {
//            Connection connection = util.getConnection();
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("TRUNCATE TABLE users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    }
}
