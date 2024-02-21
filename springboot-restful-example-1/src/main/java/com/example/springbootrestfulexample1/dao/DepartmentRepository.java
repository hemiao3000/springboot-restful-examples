package com.example.springbootrestfulexample1.dao;

import com.example.springbootrestfulexample1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
