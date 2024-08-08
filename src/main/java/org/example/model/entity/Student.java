package org.example.model.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private int age;
    private boolean isGraduated;
}
