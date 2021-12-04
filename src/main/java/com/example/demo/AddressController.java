package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    
    
    @PostMapping
    public Address updateAddress(@RequestBody Address address){
        return addressService.create(address);
    }

    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }
    @PutMapping
    public Address createAddress(@RequestBody Address address){
        return addressService.update(address);
    }
    
}
