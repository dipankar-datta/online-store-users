package com.dipankar.onlinestore.users.rest.controllers;

import com.dipankar.onlinestore.users.data.entities.User;
import com.dipankar.onlinestore.users.rest.dto.response.UserResponse;
import com.dipankar.onlinestore.users.services.UserService;
import com.dipankar.onlinestore.users.util.exception.ApplicationException;
import com.dipankar.onlinestore.users.util.exception.ExceptionType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.dipankar.onlinestore.users.util.CommonUtil.handleOptional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users.stream().map(UserResponse::toResponse).toList();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse getUserById(@PathVariable Long id) throws ApplicationException {
        Optional<User> user = userService.getUserById(id);
        return UserResponse.toResponse(handleOptional(user));
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return UserResponse.toResponse(savedUser);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse updateUser(@PathVariable Long id, @RequestBody User user) throws ApplicationException {
        if (!id.equals(user.getId())) {
            throw new ApplicationException(ExceptionType.INVALID_REQUEST);
        }
        Optional<User> existingUser = userService.getUserById(id);
        if (existingUser.isPresent()) {
            User updatedUser = userService.saveUser(user);
            return UserResponse.toResponse(updatedUser);
        } else {
            throw new ApplicationException(ExceptionType.USER_NOT_FOUND);
        }
    }

}
