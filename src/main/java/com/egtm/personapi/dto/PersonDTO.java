package com.egtm.personapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class PersonDTO {

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Min(value = 0, message = "Age must be greater than or equal to 0")
    private int age;

    public PersonDTO() {}

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter - Setter
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
}
