package com.sb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CourseDataJpaRepo extends JpaRepository<Course, Integer> {

	List<Course> findByName(String name);

	List<Course> findByNameAndAuthor(String name, String author);

	// Named parameter
	@Query(nativeQuery = true, value = "select * from course where author = :author")
	List<Course> findThroughAuthor(@Param(value = "author") String author);
	
	// Placeholder
	@Query(nativeQuery = true, value = "select * from course where name = ?1 and author = ?2")
	List<Course> findThroughNameAndAuthor(String name, String author);
	
}
