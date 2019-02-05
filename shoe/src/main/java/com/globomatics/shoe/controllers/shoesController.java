package com.globomatics.shoe.controllers;

import com.globomatics.shoe.models.Shoe;
import com.globomatics.shoe.repositories.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/shoes")
public class shoesController {

    @Autowired
    private ShoeRepository shoeRepository;

    @GetMapping
    public List<Shoe> list() {
        return shoeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Shoe shoe){
        shoeRepository.save(shoe);
    }


    @GetMapping("/{id}")
    public Shoe get(@PathVariable("id") long id){
    return shoeRepository.getOne(id);
    }

}
