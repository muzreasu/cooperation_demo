package main.java.com.company.model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String major;

    public Student(int id, String name, int age, String sex, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return this.id + ", "
                + this.name + ", "
                + this.age + ", "
                + this.sex + ","
                + this.major;
    }
}