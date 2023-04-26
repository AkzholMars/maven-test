package org.example;

import org.example.model.User;
import org.example.sevices.SQLService;
import java.util.List;

public class App {

    public static void main( String[] args ) {
        List<User> users = SQLService.getUser();

        for (User user: users) {
            System.out.println(user);

        }


    }
}
