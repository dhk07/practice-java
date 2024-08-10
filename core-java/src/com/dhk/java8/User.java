package com.dhk.java8;

public class User {
    private int userId;
    private String userName;
    private Address address;

    public User(int userId, String userName, Address address) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static boolean isValidUser(User user){

        return user.getUserName() != null;
    }

    public boolean isLegalName(User user){
        return user.getUserName().length()>4;
    }

}
