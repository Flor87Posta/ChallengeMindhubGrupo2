package com.tripnow.ecommerce.repositories;

import com.tripnow.ecommerce.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PagoRepositorio extends JpaRepository<Pago, Long> {
}
