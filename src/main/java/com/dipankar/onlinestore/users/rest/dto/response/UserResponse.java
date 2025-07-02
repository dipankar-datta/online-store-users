package com.dipankar.onlinestore.users.rest.dto.response;

import com.dipankar.onlinestore.users.data.entities.Role;
import com.dipankar.onlinestore.users.data.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static org.springframework.beans.BeanUtils.copyProperties;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private List<RoleResponse> roles;

    public static UserResponse toResponse(User user) {
        UserResponse response = new UserResponse();
        copyProperties(user, response);

        List<RoleResponse> roleResponse = user.getRoles() == null ? List.of()
                : user.getRoles().stream().map(RoleResponse::toResponse).toList();
        response.setRoles(roleResponse);

        return response;
    }

}
