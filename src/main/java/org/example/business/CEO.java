package org.example.business;

/**
 * Class representing a CEO.
 */
public class CEO {
    private String name;
    private int id;

    public CEO() {}

    public CEO(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void receiveMail(String mail) {
        System.out.println("CEO RECEIVED MAIL: " + mail);
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
}
