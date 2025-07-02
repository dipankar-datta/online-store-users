package com.dipankar.onlinestore.users.data.repositories;

import com.dipankar.onlinestore.users.data.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
}
