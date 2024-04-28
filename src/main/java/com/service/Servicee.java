package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Project;
import com.repository.Repositoryy;

@Service
public class Servicee {
	
	
	    @Autowired
	    private Repositoryy projectRepository;
	    
	    public Project createProject(Project project) {
	        return projectRepository.save(project);
	    }
	    
	    public List<Project> getAllProjects() {
	        return projectRepository.findAll();
	    }
	    
	    public Project getProjectById(Long id) {
	        return projectRepository.findById(id).orElse(null);
	    }
	    
	    public Project updateProject(Long id, Project project) {
	        if (projectRepository.existsById(id)) {
	            project.setId(id);
	            return projectRepository.save(project);
	        }
	        return null;
	    }
	    
	    public void deleteProject(Long id) {
	        projectRepository.deleteById(id);
	    }
	
}
