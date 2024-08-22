package org.razeft.user.management.repository;

import org.razeft.user.management.model.User;
import org.razeft.user.management.util.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements Repository<User> {

    private Connection getConnection() throws SQLException {
        return ConnectionDB.getConnection();
    }

    @Override
    public List findAll() {
        List<User> users = new ArrayList<>();

        try (
                Statement stm = getConnection().createStatement();
                ResultSet resultSet = stm.executeQuery("SELECT * FROM users");
        ) {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                users.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public User findById(Long id) {
        User user = null;

        try (
                PreparedStatement stm = getConnection()
                        .prepareStatement("SELECT * FROM users WHERE id = ?")) {
            stm.setLong(1, id);
            try (ResultSet resultSet = stm.executeQuery()) {
                if (resultSet.next()) {
                    User u = new User();
                    u.setId(resultSet.getLong("id"));
                    u.setUsername(resultSet.getString("username"));
                    u.setPassword(resultSet.getString("password"));
                    u.setEmail(resultSet.getString("email"));

                    user = u;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return user;
    }

    @Override
    public void save(User user) {
        String sql;
        if (user.getId() != null && user.getId() > 0) {
            sql = "UPDATE users SET username=?,password=?,email=? WHERE id=?";
        } else {
            sql = "INSERT INTO users(username,password, email) VALUES(?,?,?)";
        }
        try (PreparedStatement stm = getConnection().prepareStatement(sql)) {
            stm.setString(1, user.getUsername());
            stm.setString(2, user.getPassword());
            stm.setString(3, user.getEmail());
            if (user.getId() != null && user.getId() > 0) {
                stm.setLong(4, user.getId());
            }

            stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Long id) {
        try (PreparedStatement stm = getConnection().prepareStatement("DELETE FROM users WHERE id=?")) {
            stm.setLong(1, id);
            stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
