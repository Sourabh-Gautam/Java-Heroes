package com.sbweb.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sbweb.model.ToDo;
import com.sbweb.repo.ToDoRepository;
import com.sbweb.service.TodoService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("myName")
public class TodoControllerJpa {
	
	@Autowired
	private ToDoRepository todoRepository;

	@RequestMapping("todolist")
	public String allTodoList(ModelMap model) {
		
		List<ToDo> todos = todoRepository.findByUserName(getLoggedInUser());
		model.addAttribute("todos", todos);
		return "todopage";
	}
	
	@RequestMapping(value="addtodo")
	public String showAddTodoPage(ModelMap model) {
		
		ToDo todo = new ToDo();
		todo.setTargetDate(LocalDate.now().plusYears(1));
		model.addAttribute("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value = "addtodo", method = RequestMethod.POST)
//	public String addTodo(@RequestParam String description, ModelMap model) {
		public String addTodo(  @ModelAttribute(value = "todo") @Valid ToDo todo, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "todo";
		}
		
		String username = getLoggedInUser();
		todo.setUserName(username);
		
		todoRepository.save(todo);
		
		return "redirect:todolist";
	}
	
	@RequestMapping("deleteTodo")
	public String deleteTodo(@RequestParam long id) {
		todoRepository.deleteById(id);
		return "redirect:todolist";
	}
	
	@RequestMapping(value = "updateTodo",  method = RequestMethod.GET)
	public String ShowUpdateTodo(@RequestParam long id , ModelMap model ) {
		ToDo todo = todoRepository.findById(id).get();
		model.addAttribute("todo", todo);
		return "todo";
	}
	
	@RequestMapping(value = "updateTodo", method = RequestMethod.POST)
		public String updateTodo(  @ModelAttribute(value = "todo") @Valid ToDo todo, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "todo";
		}
		String username =getLoggedInUser();
		todo.setUserName(username);
		todoRepository.save(todo);
		return "redirect:todolist";
	}
	
	public String getLoggedInUser() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
	
}
