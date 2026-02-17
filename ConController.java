package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ConController {

    @Autowired
    private ConService conservice;

    @PostMapping("/create")
    ResponseEntity<ContactEntity> createdetialsall(@RequestBody ContactEntity entity){
        return new ResponseEntity<>(conservice.createdetials(entity), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<ContactEntity> viewbyid(@PathVariable Long id){
        return new ResponseEntity<>(conservice.viewbyid(id),HttpStatus.OK);
    }

    @GetMapping("/viewall")
    ResponseEntity<List<ContactEntity>> viewall(){
        return new ResponseEntity<List<ContactEntity>>(conservice.viewall(),HttpStatus.OK);
    }

    @PutMapping("/update")
    ResponseEntity<ContactEntity> updatedetials(@RequestBody ContactEntity entity){
        return new ResponseEntity<>(conservice.update(entity),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){
        conservice.delete(id);
    }

}
