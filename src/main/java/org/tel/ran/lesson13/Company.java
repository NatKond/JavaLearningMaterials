package org.tel.ran.lesson13;

public class Company {
    private int id;
    private String name;
    private String address;

    public Company(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Company() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (checkId(id)){
        this.id = id;}
    }

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
    private boolean checkId(int id){
        if (id <= 0) {
            System.err.println("id = " + id +": ID has to be positive integer.");
            return false;
        }else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
