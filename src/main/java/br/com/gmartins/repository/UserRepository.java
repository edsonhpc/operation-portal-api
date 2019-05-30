package br.com.gmartins.repository;

import br.com.gmartins.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

    Optional<User> findByIdAndUsername(Integer id, String username);

    @Query("Select u.name from User u where u.id in (:pIdList)")
    List<String> findUserIdList(@Param("pIdList") List<Integer> idList);

}
