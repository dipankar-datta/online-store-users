package com.dipankar.onlinestore.users.services;

import com.dipankar.onlinestore.users.data.entities.Login;
import com.dipankar.onlinestore.users.data.repositories.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;

}
