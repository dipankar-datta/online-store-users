package com.dipankar.onlinestore.users.data.repositories;

import com.dipankar.onlinestore.users.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
