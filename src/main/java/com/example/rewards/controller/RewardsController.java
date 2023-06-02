package com.example.rewards.controller;

import com.example.rewards.model.Customer;
import com.example.rewards.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rewards")
public class RewardsController {

    @Autowired
    private RewardsService rewardsService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello !! service is working";
    }

    @GetMapping("/customers")
    public List<Customer> findCustomerAll() {
        return rewardsService.getCustomerAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        Customer customer = rewardsService.getCustomerById(id);
        if (customer == null) return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}
