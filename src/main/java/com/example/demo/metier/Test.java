package com.example.demo.metier;
import java.sql.*;

public class Test {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is Successful to the database" + url);
            String query = "Insert into student(idstudent,namestud) values(101,'ram')";
            Statement statement = connection.createStatement();
            statement.execute(query);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

