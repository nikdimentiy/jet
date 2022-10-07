package hw_6;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void getName() {
        if (Objects.equals(gender, "M")) {
            System.out.println("Hello Mr. " + name);
        } else {
            System.out.println("How it's going Ms. " + name);
        }
    }
}

