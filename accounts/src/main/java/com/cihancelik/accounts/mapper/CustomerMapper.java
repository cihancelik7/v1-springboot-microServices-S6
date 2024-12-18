package com.cihancelik.accounts.mapper;

import com.cihancelik.accounts.dto.CustomerDto;
import com.cihancelik.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        System.out.println("Mapper: Customer entity alınıyor: " + customer);
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        System.out.println("Mapper: CustomerDto dönüştürüldü: " + customerDto);
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        System.out.println("Mapper: CustomerDto alınıyor: " + customerDto);
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        System.out.println("Mapper: Customer entity dönüştürüldü: " + customer);
        return customer;
    }
}