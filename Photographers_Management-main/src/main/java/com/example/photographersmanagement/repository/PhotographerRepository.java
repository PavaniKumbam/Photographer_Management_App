package com.example.photographersmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.photographersmanagement.model.Photographer;

public interface PhotographerRepository  extends JpaRepository<Photographer, Long>{
	
	List<Photographer> findByStatus(String status);
    List<Photographer> findByEmailContainingIgnoreCase(String email);

}
