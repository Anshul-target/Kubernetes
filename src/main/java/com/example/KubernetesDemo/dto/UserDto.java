package com.example.KubernetesDemo.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Transient;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
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
