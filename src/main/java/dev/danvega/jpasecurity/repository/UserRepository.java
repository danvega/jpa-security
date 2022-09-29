package dev.danvega.jpasecurity.repository;

import dev.danvega.jpasecurity.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {

    Optional<User> findByUsername(String username);

}
