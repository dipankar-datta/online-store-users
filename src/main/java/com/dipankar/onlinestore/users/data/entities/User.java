package com.dipankar.onlinestore.users.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private List<Role> roles;
}
