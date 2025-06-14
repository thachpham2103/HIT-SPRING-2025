package btvnbuoi6springboot.btvnbuoi6.repository;


import btvnbuoi6springboot.btvnbuoi6.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
