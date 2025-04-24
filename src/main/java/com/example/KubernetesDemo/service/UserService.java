package com.example.KubernetesDemo.service;


import com.example.KubernetesDemo.dto.UserDto;
import com.example.KubernetesDemo.model.UserModel;
import com.example.KubernetesDemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public  UserRepo userRepo;

    public static UserModel convertToEntity(UserDto user){
        UserModel userEntity=new UserModel();
        userEntity.setName(user.getName());
        userEntity.setPassword(user.getPassword());
        userEntity.setEmail(user.getEmail());
        userEntity.setCpassword(user.getCpassword());
        return userEntity;
    }
    public boolean save(UserDto userDto){
        UserModel user=convertToEntity(userDto);
        try {
            Optional<UserModel> saved=Optional.ofNullable(userRepo.save(user));
            if(saved.isPresent())
                return  true;
            else
                return false;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return false;
        }


    }
}
