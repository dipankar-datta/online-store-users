package com.dipankar.onlinestore.users.rest.dto.response;

import com.dipankar.onlinestore.users.data.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static org.springframework.beans.BeanUtils.copyProperties;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginResponse {
    private Long userId;
    private String password;
    private Boolean active;

    public static LoginResponse toResponse(User user) {
        LoginResponse response = new LoginResponse();
        copyProperties(user, response);
        return response;
    }
}
