package org.airtribe.credentials;

import java.util.HashMap;

public class Credentials {
    //storing userID and Password as a key value pair in a hashmap called credentials
    private HashMap<String, String> loginDetails = new HashMap<String, String>();

    public Credentials(String userId, String password) {
        //If userid and Password is already There then it will print User already exists
        if (loginDetails.containsKey(userId)) {
            System.out.println("User already exists");
        } else {
            loginDetails.put(userId, password);
        }
    }
    //Method to check if the user is valid or not

    public Boolean login(String UserId, String Password) {
        if (loginDetails.containsKey(UserId)) {
            if (loginDetails.get(UserId).equals(Password)) {
                System.out.println("Login Successful");
                return true;
            }
            } else {
                return false;
            }
        return false;
        };


};
