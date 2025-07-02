package com.dipankar.onlinestore.users.rest.dto.request;

import com.dipankar.onlinestore.users.data.entities.Role;
import com.dipankar.onlinestore.users.data.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.beans.BeanUtils.copyProperties;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private List<RoleRequest> roles;


    public User toEntity() {
        User user = new User();
        List<Role> roles = this.roles == null ? List.of() :
                this.roles.stream().map(RoleRequest::toEntity).toList();
        copyProperties(this, user);
        user.setRoles(roles);

        return user;
    }
}
