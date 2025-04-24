package com.example.KubernetesDemo.model;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("user_dtls")
public class UserModel {
    @Id
    private ObjectId id;
    @NotNull(message = "Field must not be empty")
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    @Transient
    private String cpassword;
}
