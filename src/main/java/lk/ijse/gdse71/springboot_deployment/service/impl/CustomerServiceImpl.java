package lk.ijse.gdse71.springboot_deployment.service.impl;

import lk.ijse.gdse71.springboot_deployment.entity.Customer;
import lk.ijse.gdse71.springboot_deployment.repo.CustomerRepository;
import lk.ijse.gdse71.springboot_deployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Zeenathul Ilma
 * GitHub: https://github.com/Seenathul-Ilma
 * Website: https://zeenathulilma.vercel.app/
 * --------------------------------------------
 * Created: 8/7/2025 11:47 AM
 * Project: SpringBoot_Deployment
 * --------------------------------------------
 **/

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Customer not found with id: "+ id)
        );
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer existCustomer = getCustomerById(customer.getId());
        existCustomer.setFirstName(customer.getFirstName());
        existCustomer.setLastName(customer.getLastName());
        existCustomer.setAddress(customer.getAddress());
        existCustomer.setContact(customer.getContact());
        return customerRepository.save(existCustomer);
    }

    @Override
    public void deleteCustomer(Long id) {
        Customer customer = getCustomerById(id);
        customerRepository.delete(customer);
    }
}
