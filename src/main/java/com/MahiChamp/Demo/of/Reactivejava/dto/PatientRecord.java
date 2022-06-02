package com.MahiChamp.Demo.of.Reactivejava.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientRecord {
    private Integer id;
    private String name;
    private int age;
    private String gender;

}
