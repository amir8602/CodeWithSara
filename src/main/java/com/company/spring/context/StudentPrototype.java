package com.company.spring.context;


import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class StudentPrototype {

    private int age;
    private String name;
    private String family;


    public void initMethod(){
        System.out.println("Student Prototype Create");
        System.out.println(this);
    }

    public void destroyMethod(){
        System.out.println("Student Prototype Destroy");
        System.out.println(this);
    }



}
