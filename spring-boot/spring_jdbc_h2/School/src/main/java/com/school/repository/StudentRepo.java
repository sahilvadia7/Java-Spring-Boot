package com.school.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.school.model.Student;

@Repository
public class StudentRepo{

	private JdbcTemplate jdbc;
	private ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}

	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student student) {
		
		String add = "insert into student (rollno, name, marks) values (?,?,?)";
		int rows = jdbc.update(add,student.getRollno(),student.getName(),student.getMarks());
		System.out.println(rows+" Effected");
		
	}

	public List<Student> findAll() {
		String fetch = "select * from student";

		//RowMapper for fetching data H2 DataBase
		return jdbc.query(fetch, (rs, rowNum) -> {
			Student s = context.getBean(Student.class);
			s.setRollno(rs.getInt("rollno"));
			s.setName(rs.getString("name"));
			s.setMarks(rs.getInt("marks"));
			return s;
		
	});
	}

}
