package org.airtribe.library;

public class Library {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Library(String name, String address){
        this.name = name;
        this.address = address;
    }
}
