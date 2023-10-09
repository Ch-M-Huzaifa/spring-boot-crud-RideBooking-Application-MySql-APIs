package com.uberbooking.springboot.Controller;

import com.uberbooking.springboot.Entity.Customer;
import com.uberbooking.springboot.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/registerCustomer")
    public Customer registerCustomer(@RequestBody Customer customer)
    {
        return service.saveCustomer(customer);
    }

    @PostMapping("/registerCustomers")
    public List<Customer> registerCustomers(@RequestBody List<Customer> customers)
    {
        return service.saveCustomers(customers);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomers()
    {
        return service.getCustomers();
    }

    @GetMapping("/customerById/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }

    @GetMapping("/customer/{name}")
    public Customer findCustomerByName(@PathVariable String name)
    {
        return service.getCustomerByName(name);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer)
    {
        return service.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id)
    {
        return service.deleteCustomer(id);
    }

}
