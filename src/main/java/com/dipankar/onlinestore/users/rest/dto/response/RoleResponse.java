package com.dipankar.onlinestore.users.rest.dto.response;

import com.dipankar.onlinestore.users.data.entities.Role;
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
public class RoleResponse {
    private Long id;
    private String name;
    private String description;

    public static RoleResponse toResponse(Role role) {
        RoleResponse response = new RoleResponse();
        copyProperties(role, response);
        return response;
    }
}
