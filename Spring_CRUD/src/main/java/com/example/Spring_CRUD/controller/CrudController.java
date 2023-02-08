package com.example.Spring_CRUD.controller;

import com.example.Spring_CRUD.model.Crud;
import com.example.Spring_CRUD.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Crud-Operation")
public class CrudController {

    @Autowired
    private CrudService crudService;

    @PostMapping("add-user")
    public void addUser(@RequestBody Crud crud){
        crudService.addUser(crud);
    }

    @GetMapping("get-user/id/{id}")
    public Crud gerUser(@PathVariable int id){
        return crudService.getById(id);
    }

    @GetMapping("get-all")
    public List<Crud> getAllUser(){
        return crudService.getAll();
    }

    @PutMapping("update-user/id/{id}")
    public void updateUserInfo(@PathVariable int id, @RequestBody Crud crud){
       crudService.updateUser(id,crud);
    }

    @DeleteMapping("delete-user/id/{id}")
    public void deleteUser(@PathVariable int id){
          crudService.deleteUser(id);

    }

}


