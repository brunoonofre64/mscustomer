package io.github.brunoonofre.mscustomer.infra.mapper;

import io.github.brunoonofre.mscustomer.domain.dto.CustomerInputDTO;
import io.github.brunoonofre.mscustomer.domain.dto.CustomerOutputDTO;
import io.github.brunoonofre.mscustomer.domain.entities.CustomerEntity;
import io.github.brunoonofre.mscustomer.domain.enums.ErrorMessage;
import io.github.brunoonofre.mscustomer.domain.exception.BusinesRuleException;
import io.github.brunoonofre.mscustomer.domain.mapper.CustomerMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerEntity mapperToEntity(CustomerInputDTO inputDTO) {
        if (inputDTO == null) {
            throw new BusinesRuleException(ErrorMessage.BUSINES_RULE);
        }

        return CustomerEntity
                .builder()
                .name(inputDTO.getName())
                .age(inputDTO.getAge())
                .cpf(inputDTO.getCpf())
                .build();
    }

    @Override
    public CustomerOutputDTO mapperToOutputDTO(CustomerEntity customerEntity) {
        if (customerEntity == null) {
            throw new BusinesRuleException(ErrorMessage.BUSINES_RULE);
        }

        return CustomerOutputDTO
                .builder()
                .name(customerEntity.getName())
                .age(customerEntity.getAge())
                .cpf(customerEntity.getCpf())
                .build();
    }
}
