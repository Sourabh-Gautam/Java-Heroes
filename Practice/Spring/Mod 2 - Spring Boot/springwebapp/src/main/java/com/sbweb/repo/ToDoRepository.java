package com.sbweb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbweb.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

	public List<ToDo> findByUserName(String userName);
	
}
