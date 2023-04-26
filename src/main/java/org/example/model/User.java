package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString

public class User {
    private String login;
    private String fullname;
    private String email;
    private Account userAccount;

}
