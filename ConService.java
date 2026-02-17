package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConService {

    @Autowired
    private ConRespository conrespository;

    //Create
    public ContactEntity createdetials(ContactEntity entity){
        return conrespository.save(entity);

    }

    //View by ID
    public ContactEntity viewbyid(Long id){
        return conrespository.findById(id).orElseThrow(()->new RuntimeException("ID not found"));
    }

    //view all
    public List<ContactEntity> viewall(){
        return  conrespository.findAll();
    }

    //update
    public ContactEntity update(ContactEntity entity){
        return conrespository.save(entity);
    }

    //delete
    public void delete(Long id){
        conrespository.delete(viewbyid(id));
    }

}
