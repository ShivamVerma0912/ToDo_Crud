package com.geekster.TODO.service;

import com.geekster.TODO.entity.Todo;
import com.geekster.TODO.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todorepo;



    public List<Todo> getAllTodos(){
        return todorepo.getMyTodos();
    }

    public List<Todo> getAllDoneTodos(){

            List<Todo> doneTodos = new ArrayList<>();
            for(Todo myTodo : todorepo.getMyTodos()){
                if(myTodo.isTodoDoneStatus()){
                    doneTodos.add(myTodo);
                }
            }
            return doneTodos;

        }

    public String addTodo(Todo todo){
        todorepo.add(todo);
        return "Todo Added";
    }
    public List<Todo> getAllUndoneTodos(){
        List<Todo> undoneTodos = new ArrayList<>();
        for(Todo myTodo : todorepo.getMyTodos()){
            if(!myTodo.isTodoDoneStatus()){
                undoneTodos.add(myTodo);
            }
        }
        return undoneTodos;

    }
    public String markTodo(Integer todoId , boolean status){
        for(Todo mytodo : todorepo.getMyTodos()){
            if(mytodo.getTodoId().equals(todoId)){
                mytodo.setTodoDoneStatus(status);
                return "todo updated for todo ID" + todoId;
            }

        }
        return "todo not found todo ID" + todoId;

    }


    public String removeTodo(Integer todoId) {
        for(Todo mytodo : todorepo.getMyTodos()){
            if(mytodo.getTodoId().equals(todoId)){
                todorepo.delete(mytodo);
                return "todo removed for todo ID :" + todoId;
            }
        }
        return "todo doesn't exit :" + todoId;
    }
}
