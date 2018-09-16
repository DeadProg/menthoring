package com.pelmen.DOP;

public class Person {
    private int age ;
    private String name;
    private String lastName;
    private String patronomic;

    public Person(int age, String name, String lastName, String patronomic) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.patronomic = patronomic;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public void myName(){
        System.out.println("My name is "+lastName+" "+name+" "+patronomic);
    }
    public void myAge(){
        System.out.println("I am"+" "+age);
    }

    @Override
    public String toString() {
        return "My name is " + lastName + " " + name + " " + patronomic+"\n"+"I am "+age+" years old";

    }
}
