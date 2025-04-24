package school.sptech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.sptech.entity.Banda;

public interface BandaRepository extends JpaRepository<Banda, Integer> {
}
