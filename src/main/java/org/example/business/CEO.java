package org.example.business;

public class CEO {
    private String name;
    private int id;

    public CEO() {}

    public CEO(String name) { this.name = name; }

    public CEO(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void receiveEmail(String email) {
        System.out.println(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
