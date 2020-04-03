package com.atul.jvm.jvm.pojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRecordTest  {

    CustomerRecord customerRecord;

    @BeforeEach
    void setUp() {
        customerRecord = new CustomerRecord();


    }

    @Test
    void test_2() {
        final Customer customer = new Customer("atul");
        final Customer customer1 = new Customer("amit");
        customerRecord.addCustomer(customer);
        customerRecord.addCustomer(customer1);
        final Customer cus = customerRecord.getCustomerByNameCopy("amit");
        System.out.println(cus);

//        for (Customer customer2 : customerRecord.getCustomers().values()) {
//            System.out.println(customer2);
//        }

    }

    @Test
    void test_1() {
        final Customer customer = new Customer("atul");
        final Customer customer1 = new Customer("amit");
        customerRecord.addCustomer(customer);
        customerRecord.addCustomer(customer1);
        customerRecord.getCustomers().clear();

        for (Customer customer2 : customerRecord.getCustomers().values()) {
            System.out.println(customer2);
        }

    }
}