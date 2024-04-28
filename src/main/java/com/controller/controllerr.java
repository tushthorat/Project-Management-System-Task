package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Project;
import com.service.Servicee;

@RestController
public class controllerr {
	 @Autowired
	 
	    private Servicee projectService;
	    
	    @PostMapping("project")
	    public Project addProject(@RequestBody Project project) {
	        return projectService.createProject(project);
	    }
	    
	    @GetMapping("get")
	    public List<Project> getAllProjects() {
	        return projectService.getAllProjects();
	    }
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
	        Project project = projectService.getProjectById(id);
	        if (project != null) {
	            return ResponseEntity.ok(project);
	        }
	        return ResponseEntity.notFound().build();
	    }
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<Project> updateProject(@PathVariable Long id, @RequestBody Project project) {
	        Project updatedProject = projectService.updateProject(id, project);
	        if (updatedProject != null) {
	            return ResponseEntity.ok(updatedProject);
	        }
	        return ResponseEntity.notFound().build();
	    }
	    
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
	        projectService.deleteProject(id);
	        return ResponseEntity.noContent().build();
	    }
}
