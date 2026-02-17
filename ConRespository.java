package com.example.contact;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConRespository extends JpaRepository<ContactEntity,Long> {


    List<ContactEntity> id(Long id);
}
