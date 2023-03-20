package io.github.brunoonofre.mscustomer.infra.repository;

import io.github.brunoonofre.mscustomer.domain.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
    boolean existsByCpf(String cpf);
    Optional<CustomerEntity> findByCpf(String cpf);
}
