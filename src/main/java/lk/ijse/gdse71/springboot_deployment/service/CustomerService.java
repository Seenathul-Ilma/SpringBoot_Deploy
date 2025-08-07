package lk.ijse.gdse71.springboot_deployment.service;

import lk.ijse.gdse71.springboot_deployment.entity.Customer;
import lk.ijse.gdse71.springboot_deployment.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long id);
}
