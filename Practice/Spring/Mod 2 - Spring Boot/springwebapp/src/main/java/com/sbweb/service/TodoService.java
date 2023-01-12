package com.sbweb.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.TargetDataLine;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbweb.model.ToDo;

import jakarta.security.auth.message.MessagePolicy.Target;
import jakarta.validation.Valid;

@Service
public class TodoService {

	private static List<ToDo> toDos = new ArrayList<>();
	
	private static long todoCount = 0;
	
	static {
		toDos.add(new ToDo(++todoCount, "sumit","learn SB 1", LocalDate.now().plusYears(1), false));
		toDos.add(new ToDo(++todoCount, "sourabh","learn Spring Core 1", LocalDate.now().plusYears(1), false));
		toDos.add(new ToDo(++todoCount, "Rohit","learn AWS 1", LocalDate.now().plusYears(1), false));
		toDos.add(new ToDo(++todoCount, "Yogi","learn Java 1", LocalDate.now().plusYears(1), false));
	}
	
	public List<ToDo> findByUserName(String userName) {
		return toDos.stream().filter(e -> e.getUserName().equalsIgnoreCase(userName)).collect(Collectors.toCollection(ArrayList::new));
	}
	
	public List<ToDo> addNewTodo(String userName, String description, LocalDate targetDate, boolean done) {
		ToDo toDo = new ToDo(++todoCount, userName, description, targetDate, done );
		toDos.add(toDo);
		return toDos;
	}
	

	public void deleteTodoById(long id) {
//		 toDos = toDos.stream().filter(e -> e.getId()!=id).collect(Collectors.toCollection(ArrayList::new));
		toDos.removeIf (e -> e.getId() ==id );
	}

	public ToDo findById(long id) {
		ToDo todo = toDos.stream().filter(e -> e.getId() == id).findFirst().get();
		return todo;
	}

	public void updateTodo(@Valid ToDo todo) {
			deleteTodoById(todo.getId());
			toDos.add(todo);
	}

	
}
