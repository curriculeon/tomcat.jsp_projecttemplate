package com.github.curriculeon;

public class User {

    private String id;
    private String name;

    public User() {
    }

    public User(String id) {
        this.id = id;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getDefaultUser() {
        return new User("1111", "Up1");
    }
}
