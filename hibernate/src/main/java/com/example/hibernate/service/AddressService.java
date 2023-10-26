package com.example.hibernate.service;

import com.example.hibernate.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();
    Address getAddressById(Long id);
    Address addAddress(Address address);
    Address updateAddress(Long id, Address address);
    void deleteAddress(Long id);
}
