package com.uberbooking.springboot.Service;

import com.uberbooking.springboot.Entity.Customer;
import com.uberbooking.springboot.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer){
        return repository.save(customer);
    }
    public List<Customer> saveCustomers(List<Customer>customers)

    {
        return repository.saveAll(customers);
    }

    public List<Customer> getCustomers()
    {
        return repository.findAll();
    }

    public Customer getCustomerById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public Customer getCustomerByName(String name)
    {
        return repository.findByName(name);
    }

    public String deleteCustomer(int id) {
        repository.deleteById(id);
        return "customer removed !! " + id;
    }

    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = repository.findById(customer.getId()).orElse(null);
        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());
        return repository.save(existingCustomer);
    }
}
