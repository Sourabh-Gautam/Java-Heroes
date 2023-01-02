package com.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepo {
	
	@Autowired
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.persist(course);
	}
	
	public void delete(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}

}
