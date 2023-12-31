package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private  Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;


   public Student(Long id,String name,String email,LocalDate dob,Integer age){
       this.id = id;
       this.email = email;
       this.name = name;
       this.dob = dob;
       this.age = age;
   };

    public Student(String name,Integer age,LocalDate dob,String email){
        this.email = email;
        this.name = name;
        this.dob = dob;
        this.age = age;
    };

   public Student(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
