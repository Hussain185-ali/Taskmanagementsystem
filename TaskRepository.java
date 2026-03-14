package com.tastmanager.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tastmanager.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}