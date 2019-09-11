package com.tkachuk.buhgalters.database.repository;

import com.tkachuk.buhgalters.database.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
