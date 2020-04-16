package guru.springframework.brewery.web.service;

import java.util.UUID;

import guru.springframework.brewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

	void updateCustomer(UUID customerId, CustomerDto customerDto);

	void deleteById(UUID customerId);

	CustomerDto saveNewCustomer(CustomerDto customerDto);
}