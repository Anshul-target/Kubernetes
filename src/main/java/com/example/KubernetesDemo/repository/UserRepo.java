package com.example.KubernetesDemo.repository;

import com.example.KubernetesDemo.model.UserModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserModel, ObjectId> {

}
