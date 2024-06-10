package com.tay.dockerdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;

    public DemoEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
