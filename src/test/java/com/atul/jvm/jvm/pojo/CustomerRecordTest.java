package com.atul.jvm.jvm.pojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.SendingContext.RunTime;

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


    @Test
    void test() {

        String one = "hello";
        String two = "hello";

        if (one == two) {
            System.out.println("same");
        } else {
            System.out.println("diff");
        }
    }

    @Test
    void test_3() {
        try {
            throw new RuntimeException("dd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void test_memory() {
        final Runtime runtime = Runtime.getRuntime();
        final long memory = runtime.freeMemory();
        System.out.println( "Free memory --> " + ( memory / 1024)/1024 + " MB");
        for (int i = 0; i < 10000000; i++) {
            final Customer customer = new Customer("John");
        }

        final long memor2 = runtime.freeMemory();
        System.out.println( "Free memory --> " + ( memor2 / 1024)/1024 + " MB");

        System.gc();

        final long memor3 = runtime.freeMemory();
        System.out.println( "Free memory --> " + ( memor3 / 1024)/1024 + " MB");


    }
}