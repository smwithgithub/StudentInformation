package com.codewithsmshamim;

public class Student {

    private String name;
    private String dept;
    private String section;
    private int id;

    public Student() {
    }

    public Student(String name, String dept, String section, int id) {
        this.name = name;
        this.dept = dept;
        this.section = section;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", section='" + section + '\'' +
                ", id=" + id +
                '}';
    }
}