package suveniri.jurica.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import suveniri.jurica.backend.models.Souvenir;

public interface SouvenirRepository extends JpaRepository<Souvenir, Long> {
}
