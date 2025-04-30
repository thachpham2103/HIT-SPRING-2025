package btvnbuoi6springboot.btvnbuoi6.repository;

import btvnbuoi6springboot.btvnbuoi6.entity.Positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionsRepository extends JpaRepository<Positions, Long> {
}
