package com.company.spring.context;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentSingleton {

    private int age;
    private String name;
    private String family;

    public void initMethod(){
        System.out.println("Student Singleton Create");
        System.out.println(this);
    }

    public void destroyMethod(){
        System.out.println("Student Singleton Destroy");
        System.out.println(this);
    }


}
