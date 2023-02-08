package com.example.Spring_CRUD.service;

import com.example.Spring_CRUD.model.Crud;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class CrudService {

    private static List<Crud> cruds = new ArrayList<>();
    private static int crudCount = 0;
    static {
        cruds.add(new Crud(++crudCount,"Ratul","ratul621","Raghunathpur","9002056754"));
        cruds.add(new Crud(++crudCount,"ABC","ABC621","Mumbai","90****2554"));
        cruds.add(new Crud(++crudCount,"CDE","CDE621","Bangalore","90****6754"));
        cruds.add(new Crud(++crudCount,"EFG","EFG621","Hyderabad","90****7854"));
    }
    public static List<Crud> getAll(){
        return cruds;
    }
    public Crud getById(int id){
        Predicate<? super Crud> predicate = crud -> crud.getId()==id;
        Crud crud = cruds.stream().filter(predicate).findFirst().get();
        return crud;
    }
    public void addUser(Crud crud){
        cruds.add(crud);
    }
    public void deleteUser(int id){
        Predicate<? super Crud> predicate = crud -> crud.getId()==id;
        cruds.removeIf(predicate);
    }
    public void updateUser(int id,Crud newCrud){
        Crud crud = getById(id);
        crud.setId(newCrud.getId());
        crud.setName(newCrud.getName());
        crud.setUserName(newCrud.getUserName());
        crud.setAddress(newCrud.getAddress());
        crud.setNumber(newCrud.getNumber());
    }

}
