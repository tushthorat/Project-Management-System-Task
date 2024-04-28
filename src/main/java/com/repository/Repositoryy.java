package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Project;

@Repository
public interface Repositoryy extends JpaRepository<Project, Long> {
	
}