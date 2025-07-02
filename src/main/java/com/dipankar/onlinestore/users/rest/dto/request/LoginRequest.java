package com.dipankar.onlinestore.users.rest.dto.request;

import com.dipankar.onlinestore.users.data.entities.Login;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static org.springframework.beans.BeanUtils.copyProperties;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginRequest {
    private Long userId;
    private String password;
    private Boolean active;

    public Login toEntity() {
        Login login = new Login();
        copyProperties(this, login);
        return login;
    }
}
