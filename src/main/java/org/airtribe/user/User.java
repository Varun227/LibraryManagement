package org.airtribe.user;

public class User {
    private String name;

    private String email;

    private String address;

    private String phone;

    private Integer UserId;

    static Integer userCount =1;

    public User(String name,String email, String address,String phone){
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.UserId = userCount;
        userCount++;

    }


    public void displayUserDetails(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("UserId: " + UserId);
    }


    public String getEmail() {
        return email;
    }
}
