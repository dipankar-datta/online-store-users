package com.dipankar.onlinestore.users.data.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Login {
    private Long userId;
    private String password;
    private Boolean active;
}
