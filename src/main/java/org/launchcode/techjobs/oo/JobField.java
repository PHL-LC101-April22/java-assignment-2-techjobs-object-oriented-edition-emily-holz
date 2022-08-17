package org.launchcode.techjobs.oo;

public abstract class JobField {

    private String value;
    private int id;
    private int nextId = 1;

    //constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    //methods

    public String toString() {return value;}


    //getters and setters


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
