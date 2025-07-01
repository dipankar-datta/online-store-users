package com.dipankar.onlinestore.users.rest.dto.request;

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
public class UserRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;


    public User toEntity() {
        User user = new User();
        copyProperties(this, user);
        return user;
    }
}
