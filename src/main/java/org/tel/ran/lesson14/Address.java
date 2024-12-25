package org.tel.ran.lesson14;

public class Address {
    private String city;
    private String street;
    private String houseNumber;
    private String postCode;

    public Address(String city, String street, String houseNumber, String postCode) {
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
            this.postCode = postCode;
        if (postCode.charAt(0) == 1){
            System.out.println("First district");
        }

    }

    public Address(String city, String street, String houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
