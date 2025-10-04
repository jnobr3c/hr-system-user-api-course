package br.com.josenobre.userapi.repositories;

import br.com.josenobre.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
