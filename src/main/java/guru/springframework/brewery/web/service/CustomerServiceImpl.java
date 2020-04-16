package guru.springframework.brewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .customerName("Steve Jobs")
            .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
       // TODO implement update
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("deleting a customer: " + customerId);

    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }
    
}