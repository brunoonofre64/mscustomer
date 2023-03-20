package io.github.brunoonofre.mscustomer.domain.mapper;

import io.github.brunoonofre.mscustomer.domain.dto.CustomerInputDTO;
import io.github.brunoonofre.mscustomer.domain.dto.CustomerOutputDTO;
import io.github.brunoonofre.mscustomer.domain.entities.CustomerEntity;

public interface CustomerMapper {

    CustomerEntity mapperToEntity(CustomerInputDTO inputDTO);
    CustomerOutputDTO mapperToOutputDTO(CustomerEntity customerEntity);
}
