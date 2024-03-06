package br.com.edu.springbootauthapi.repository;

import br.com.edu.springbootauthapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
