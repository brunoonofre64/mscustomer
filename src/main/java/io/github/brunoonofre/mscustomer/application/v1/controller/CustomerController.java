package io.github.brunoonofre.mscustomer.application.v1.controller;

import io.github.brunoonofre.mscustomer.domain.dto.CustomerInputDTO;
import io.github.brunoonofre.mscustomer.domain.dto.CustomerOutputDTO;
import io.github.brunoonofre.mscustomer.domain.entities.CustomerEntity;
import io.github.brunoonofre.mscustomer.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService service;

    @PostMapping
    public ResponseEntity<CustomerEntity> saveNewCustomer(@RequestBody CustomerInputDTO inputDTO) {
        var customer = service.saveNewCustomer(inputDTO);

        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(customer.getCpf())
                .toUri();

        return ResponseEntity.created(headerLocation).build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public CustomerOutputDTO findCustomerByCpf(@RequestParam String cpf) {
        return service.findCustomerByCpf(cpf);
    }
}
