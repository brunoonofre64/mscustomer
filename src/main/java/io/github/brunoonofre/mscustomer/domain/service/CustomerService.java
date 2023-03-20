package io.github.brunoonofre.mscustomer.domain.service;

import io.github.brunoonofre.mscustomer.domain.dto.CustomerInputDTO;
import io.github.brunoonofre.mscustomer.domain.dto.CustomerOutputDTO;
import io.github.brunoonofre.mscustomer.domain.entities.CustomerEntity;

public interface CustomerService {
    CustomerEntity saveNewCustomer(CustomerInputDTO inputDTO);
    CustomerOutputDTO findCustomerByCpf(String cpf);
}
