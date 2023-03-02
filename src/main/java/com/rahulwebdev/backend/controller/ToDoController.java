package com.rahulwebdev.backend.controller;

import com.rahulwebdev.backend.data.ToDo;
import com.rahulwebdev.backend.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

        @Autowired
        private ToDoService toDoService;

        @GetMapping
        public List<ToDo> findAll(){
            return toDoService.findAll();
        }

        @GetMapping("/{id}")
        public ToDo findById(@PathVariable String id){
            return toDoService.findById(id);
        }

        @PostMapping
        public ToDo save(@RequestBody ToDo toDo){
            return toDoService.save(toDo);
        }

        @PostMapping("/{id}")
        public ToDo update(@RequestBody ToDo todo){
            return toDoService.save(todo);
        }

        @DeleteMapping("/{id}")
        public void deleteById(@PathVariable String id){
            toDoService.deleteById(id);
        }
}
