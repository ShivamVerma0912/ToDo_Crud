package com.geekster.TODO.controller;

import com.geekster.TODO.entity.Todo;
import com.geekster.TODO.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

   // private List<Todo> myTodos;

//    public TodoController(){
//        myTodos = new ArrayList<>();
//    }
    @GetMapping("todos")
    public List<Todo> getAllTodos(){

        return todoService.getAllTodos();
    }
    @GetMapping("todo/done")
    public List<Todo> getDoneTodos(){
       return todoService.getAllDoneTodos();

    }
    @PostMapping("todo")
    public String addTodo( @RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @GetMapping("todo/undone")
    public List<Todo> getNotDoneTodos(){
       return todoService.getAllUndoneTodos();
    }
    @PutMapping("todo/{todoId}/{status}")
    public String markTodo(@PathVariable Integer todoId ,@PathVariable boolean status){
            return todoService.markTodo(todoId,status);

    }
    @DeleteMapping("todo/{todoId}")
    public String removeTodo(@PathVariable Integer todoId){
       return todoService.removeTodo(todoId);
    }







}
