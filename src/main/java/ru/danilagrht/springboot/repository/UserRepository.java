package ru.danilagrht.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.danilagrht.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
