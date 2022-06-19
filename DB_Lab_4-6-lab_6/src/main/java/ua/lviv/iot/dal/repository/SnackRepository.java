package ua.lviv.iot.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.domain.snack.Snack;

@Repository
public interface SnackRepository extends JpaRepository<Snack, Integer> {
}
