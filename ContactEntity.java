package com.example.contact;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int phoneno;



}
