package com.sbrest.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sbrest.model.User;

@Service
public class UserService {

	private static List<User> userList = new ArrayList<>();
	
	private static int id = 100;
	
	static {
		userList.add(new User(++id, "sumit_dillo", LocalDate.now().minusYears(30)));
		userList.add(new User(++id, "rohit_dillo", LocalDate.now().minusYears(20)));
		userList.add(new User(++id, "sourabh_dillo", LocalDate.now().minusYears(25)));
	}
	
	public List<User> findAll() {
		return userList;
	}

	public User findById(long id) {
		return userList.stream().filter(e -> e.getId()==id).findFirst().orElse(null);
	}
	
	public User save(User user) {
		user.setId(++id);
		userList.add(user);
		return user;
	}

	public void deleteById(long id) {
		userList.removeIf(e->e.getId()==id);
	}
	
}
