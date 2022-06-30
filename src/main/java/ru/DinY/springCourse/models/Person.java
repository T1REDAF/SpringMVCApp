package ru.DinY.springCourse.models;

public class Person {

    private String name;
    private int id ;

    public Person(int id,String name) {
        this.name = name;
        this.id = id;
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


    public Person() {
    }
}