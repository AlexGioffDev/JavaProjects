package org.razeft.user.management.example;

import org.razeft.user.management.model.User;
import org.razeft.user.management.repository.Repository;
import org.razeft.user.management.repository.UserRepositoryImpl;
import org.razeft.user.management.util.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try(Connection connection = ConnectionDB.getConnection()){
            Repository<User> repository = new UserRepositoryImpl();
            Scanner scanner = new Scanner(System.in);
            int option = 0;

            while (option != 5){
                System.out.println("Menu: ");
                System.out.println("1 - List");
                System.out.println("2 - Create");
                System.out.println("3 - Update");
                System.out.println("4 - Delete");
                System.out.println("5 - Exit");
                System.out.print("Choice an option (number): ");

                option = scanner.nextInt();

                switch (option){
                    case 1:
                        repository.findAll().forEach(System.out::println);
                        break;
                    case 2:
                        System.out.println("Create an User");
                        System.out.print("Username: ");
                        String username = scanner.next();
                        System.out.print("Password: ");
                        String password = scanner.next();
                        System.out.print("Email: ");
                        String email = scanner.next();

                        User user = new User();
                        user.setUsername(username);
                        user.setPassword(password);
                        user.setEmail(email);

                        repository.save(user);
                        System.out.println("User create!");

                        break;
                    case 3:
                        System.out.println("Update an user");
                        System.out.print("Write a valid ID: ");
                        Long userID = scanner.nextLong();
                        scanner.nextLine();
                        User userFind = repository.findById(userID);
                        if(userFind != null){
                            System.out.println("Enter new values (blank to confirm the keep the current)");
                            System.out.print("Username (" + userFind.getUsername() + "): ");
                            String newUsername = scanner.nextLine();
                            System.out.print("Password (" + userFind.getPassword() + "): ");
                            String newPassword = scanner.nextLine();
                            System.out.print("Email (" + userFind.getEmail() + "): ");
                            String newEmail = scanner.nextLine();

                            userFind.setUsername(Optional.ofNullable(newUsername)
                                    .filter(s -> !s.isEmpty())
                                    .orElse(userFind.getUsername()));
                            userFind.setPassword(Optional.ofNullable(newPassword)
                                    .filter(s -> !s.isEmpty())
                                    .orElse(userFind.getPassword()));
                            userFind.setEmail(Optional.ofNullable(newEmail)
                                    .filter(s -> !s.isEmpty())
                                    .orElse(userFind.getEmail()));
                            repository.save(userFind);
                            System.out.println("User update!");
                        } else {
                            System.out.println("User not found! Check the ID again!");
                        }
                        break;
                    case 4:
                        System.out.print("Write the id of the user you want to delete: ");
                        Long userId = scanner.nextLong();
                        repository.delete(userId);
                        System.out.println("User delete!");
                        break;
                    case 5:
                        System.out.println("Exit the program");
                        break;
                    default:
                        System.out.println("Wrong choice!!");
                        break;
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
