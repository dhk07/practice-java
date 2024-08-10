package com.dhk.java8;

import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {

    }

    private static String beforeJava8(){
        Address address = new Address("102", "4", "Gurugram","Haryana", "India", 121001);
        User user = new User(300, "Rajesh", address);
        if (user != null) {
            if (address != null) {
                String street = address.getStreet();
                if (street != null) {
                    return street;
                }
            }
        }
        return "not specified";
    }

    private static String afterJava8(){
        Optional<User> user = Optional.ofNullable(getUser());
        return user
                .map(User::getAddress)
                .map(Address::getStreet)
                .orElse("not specified");
    }

    private static User getUser() {
        return new User(300
                , "Rajesh",
                new Address("102"
                        , "4"
                        , "Gurugram"
                        ,"Haryana"
                        , "India"
                        , 121001));
    }
}
