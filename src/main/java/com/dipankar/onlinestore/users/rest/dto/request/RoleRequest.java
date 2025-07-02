package com.dipankar.onlinestore.users.rest.dto.request;

import com.dipankar.onlinestore.users.data.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static org.springframework.beans.BeanUtils.copyProperties;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoleRequest {
    private Long id;
    private String name;
    private String description;

    public Role toEntity() {
        Role role = new Role();
        copyProperties(this, role);
        return role;
    }
}
