package com.atul.jvm.jvm.pojo;

public class Customer {
    private String name;

    public Customer(final Customer oldCustomer) {
        this.name = oldCustomer.name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
