package com.atul.jvm.jvm.pojo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecord implements Iterable<Customer> {

    private Map<String, Customer> customerMap;

    public CustomerRecord() {
        customerMap = new HashMap<>();
    }

    public Customer getCustomerByNameCopy(final String name) {
        return new Customer(this.customerMap.get(name));
    }

    public void addCustomer(final Customer customer) {
        customerMap.put(customer.getName(), customer);
    }

    public Map<String, Customer> getCustomers() {
        return Collections.unmodifiableMap(this.customerMap);
//        return this.customerMap;
    }


    @Override
    public Iterator<Customer> iterator() {
        return this.customerMap.values().iterator();
    }
}
