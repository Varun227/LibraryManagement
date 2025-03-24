package org.airtribe.account;

import org.airtribe.credentials.Credentials;
import org.airtribe.user.User;

class Account {

    private String id;

    private String password;

    private String name;

    //By default, True;
    private Boolean status = true;

    public Credentials credentials;

    public User person;

    Account(String id, String password, User person) {
        this.id = id;
        this.password = password;
        this.person = person;
        this.credentials = new Credentials(id, password);
    }

    public void resetPassword() {
        password = "";
    }
}
