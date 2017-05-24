package com.cwq.apple.respositroy;

import org.springframework.data.repository.CrudRepository;

import com.cwq.apple.model.Student;

public interface StudentRespositroy extends 
   CrudRepository<Student, Integer>{
	Student findStudentById(Integer id);

}
