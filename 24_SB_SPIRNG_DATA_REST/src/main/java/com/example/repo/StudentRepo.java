package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Student;

@RepositoryRestResource(path = "books")
public interface StudentRepo  extends JpaRepository<Student, Integer>{
	

}
