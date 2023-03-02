package com.rahulwebdev.backend.service;

import com.rahulwebdev.backend.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rahulwebdev.backend.data.ToDo;
import com.rahulwebdev.backend.repository.ToDoRepository;
import java.util.List;
@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;
    public List<ToDo> findAll(){
        return toDoRepository.findAll();
    }

    public ToDo findById(String id){
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo toDo){
        return toDoRepository.save(toDo);
    }

    public void deleteById(String id){
        toDoRepository.deleteById(id);
    }
}
