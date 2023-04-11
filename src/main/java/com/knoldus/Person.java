package com.knoldus;

public class Person {
    String name;
    String email;
    Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals(""))
        {
            this.name="Error! Empty Input.";
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.equals(""))
        {
            this.email="Error! Empty Input.";
        }
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age==0) {
            this.age=age;
            System.out.println("Error: Age cannot be zero");
        }
        else if (age<0) {
            this.age=age;
            System.out.println("Error: Invalid Age");
        } else
        this.age = age;
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.setEmail("");
        person.setName("");
        person.setAge(0);
        System.out.println("Name: "+person.getName());
        System.out.println("Email: "+person.getEmail());
        System.out.println("Age: "+person.getAge());
    }
}
