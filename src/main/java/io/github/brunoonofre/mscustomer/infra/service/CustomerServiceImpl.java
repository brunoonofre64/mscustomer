package io.github.brunoonofre.mscustomer.infra.service;

import io.github.brunoonofre.mscustomer.domain.dto.CustomerInputDTO;
import io.github.brunoonofre.mscustomer.domain.dto.CustomerOutputDTO;
import io.github.brunoonofre.mscustomer.domain.entities.CustomerEntity;
import io.github.brunoonofre.mscustomer.domain.enums.ErrorMessage;
import io.github.brunoonofre.mscustomer.domain.exception.BusinesRuleException;
import io.github.brunoonofre.mscustomer.domain.mapper.CustomerMapper;
import io.github.brunoonofre.mscustomer.domain.service.CustomerService;
import io.github.brunoonofre.mscustomer.infra.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper mapper;

    @Override
    public CustomerEntity saveNewCustomer(CustomerInputDTO inputDTO) {
        if(inputDTO == null) {
            throw new BusinesRuleException(ErrorMessage.BUSINES_RULE);
        }

        if (customerRepository.existsByCpf(inputDTO.getCpf())) {
            throw new BusinesRuleException(ErrorMessage.BUSINES_RULE);
        }

        CustomerEntity customer = mapper.mapToEntity(inputDTO);
        customerRepository.save(customer);

        return customer;
    }

    @Override
    public CustomerOutputDTO findCustomerByCpf(String cpf) {
        if (cpf == null) {
            throw new BusinesRuleException(ErrorMessage.BUSINES_RULE);
        }

        var customer = customerRepository.findByCpf(cpf)
                .orElseThrow(() -> new BusinesRuleException(ErrorMessage.BUSINES_RULE));

        return mapper.mapToOutputDTO(customer);
    }
}
