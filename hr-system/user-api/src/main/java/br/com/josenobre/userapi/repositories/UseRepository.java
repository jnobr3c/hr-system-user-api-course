package br.com.josenobre.userapi.repositories;

import br.com.josenobre.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UseRepository extends JpaRepository<User,Long> {
}
