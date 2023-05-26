package respositories;

import models.DestinoExcursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DestinoExcursionRepositorio extends JpaRepository<DestinoExcursion, Long> {
}
