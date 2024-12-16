package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repositroy.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	public void add(Student student) 
	{
		repository.save(student);
	}
	
	public List<Student> getAll(){
		List<Student> all=(List<Student>) repository.findAll();
		return all;
	}

}
