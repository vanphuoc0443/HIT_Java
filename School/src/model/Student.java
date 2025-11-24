package model;

public class Student {
    private String name;
    private int age;
    private String lopHoc;


    public Student() {
    }

    public Student(String name, int age, String lopHoc) {
        this.name = name;
        this.age = age;
        this.lopHoc = lopHoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lopHoc='" + lopHoc + '\'' +
                '}';
    }
}
