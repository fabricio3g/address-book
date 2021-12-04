package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
    
    private Map<String, Address> addresses = new HashMap<>();
    public Address create(Address address){

        String id = UUID.randomUUID().toString();
        address.setId(id);
        addresses.put(address.getId(), address);

        return address;
    }

    public Address update(Address address){
        String id = address.getId();
        addresses.put(id, address);
        return address;
    }

    public List<Address> getAll() {

        System.out.println(addresses.values());
        return new ArrayList<Address>(addresses.values());

    }
    

    public List<Address> delete(){
        return null;
    }

}
