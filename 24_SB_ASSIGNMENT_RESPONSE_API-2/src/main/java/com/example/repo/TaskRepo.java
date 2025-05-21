package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Task;

public interface TaskRepo extends JpaRepository<Task, Long>{

}
