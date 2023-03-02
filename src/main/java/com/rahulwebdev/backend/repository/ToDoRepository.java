package com.rahulwebdev.backend.repository;
import com.rahulwebdev.backend.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {}