package com.example.controller;

import com.example.domain.Utilizator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.service.UtilizatorService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "")             //pentru headerul de request http
@RestController
@RequestMapping("app")
public class UtilizatorController {
    @Autowired
    private final UtilizatorService serv;
    @Autowired
    public UtilizatorController(UtilizatorService serv){
        this.serv=serv;
    }


   // @RequestMapping(method = RequestMethod.GET)
//    public Utilizator[] get_All(){
//        return serv.find_all().toArray(new Utilizator[0]);
//    }


//    @GetMapping("/")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Utilizator> getAll(){
//        return this.serv.find_all();
//    }

//    @GetMapping("/")
//    @ResponseStatus(HttpStatus.OK)
//    public Utilizator[] getUsers(){
//        return serv.find_all().toArray(new Utilizator[0]);
//    }



    @GetMapping("/test")
    public String homePage(){
        return "HomePage";
    }


    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<Utilizator> getAll(){
        return this.serv.find_all();
    }

    @GetMapping ("/users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Utilizator> getOne(@PathVariable Long id){
        return serv.find_one(id);
    }

    @PostMapping("/users")
    public Utilizator addUser(@RequestBody Utilizator user){
        return serv.add(user);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        return serv.delete(id);
    }

    @PutMapping("users/{id}")
    public  Utilizator updateUser(@RequestBody Utilizator new_user,@PathVariable Long id){
        return serv.update(id, new_user);
    }
}
