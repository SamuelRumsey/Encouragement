package com.github.samuelrumsey;

class User {

    private String firstName;
    private String middleName;
    private String lastName;

    User(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getMiddleName() {
        return middleName;
    }

    String getLastName() {
        return lastName;
    }
}
