package com.examples.junit4;

class CustomerService {

    Customer findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException(666, "Name is empty!");
        }

        return new Customer(name);

    }

}
