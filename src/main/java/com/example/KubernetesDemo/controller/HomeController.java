package com.example.KubernetesDemo.controller;


import com.example.KubernetesDemo.dto.UserDto;
import com.example.KubernetesDemo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String index(){
        return "Heello from this side";
    }
    @PostMapping("/save")
    public ResponseEntity<Map<String,String>> saveUser(@ModelAttribute @Valid UserDto userDto){
        boolean response=userService.save(userDto);

        Map<String,String>map=new HashMap<>();
        map.put("response","User not saved");

        if (response==true){
            map.put("response","User saved !");
         return  new ResponseEntity<>(map,HttpStatus.OK);
        }
        else {
            return  new ResponseEntity<>(map,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
