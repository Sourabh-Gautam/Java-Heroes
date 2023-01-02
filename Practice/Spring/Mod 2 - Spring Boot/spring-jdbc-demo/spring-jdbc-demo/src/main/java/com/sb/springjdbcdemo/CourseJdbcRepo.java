package com.sb.springjdbcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static String INSERT_SQL = """
			insert into course values(?,?,?);
			""";


	private static String DELETE_SQL = """
			delete from course where id=?;
			""";
	
	private static String SELECT_SQL = """
			select * from course where id=?;
			""";

	public void insert(Course course) {
		jdbcTemplate.update(INSERT_SQL, course.getId(), course.getName(), course.getAuthor());
	}

	
	public void delete(int id) {
		jdbcTemplate.update(DELETE_SQL, id);
	}
	
	
	public Course findById(int id) {
		 return jdbcTemplate.queryForObject(SELECT_SQL, new BeanPropertyRowMapper<>(Course.class), id);
	}

}
