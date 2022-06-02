package com.MahiChamp.Demo.of.Reactivejava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class PatientEntity {
    @Id
    private Integer id;
    private String name;
    private int age;
    private String gender;


}
