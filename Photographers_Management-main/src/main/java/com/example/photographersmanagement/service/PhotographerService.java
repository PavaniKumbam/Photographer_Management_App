package com.example.photographersmanagement.service;
import com.example.photographersmanagement.model.Photographer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.photographersmanagement.repository.PhotographerRepository;

@Service
public class PhotographerService {
	@Autowired
    private PhotographerRepository repo;

    public List<Photographer> getAllPhotographers() {
        return repo.findAll();
    }

    public List<Photographer> searchByEmail(String email) {
        return repo.findByEmailContainingIgnoreCase(email);
    }

    public List<Photographer> filterByStatus(String status) {
        return repo.findByStatus(status);
    }

    public Photographer getPhotographer(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Photographer savePhotographer(Photographer photographer) {
        return repo.save(photographer);
    }

    public void deletePhotographer(Long id) {
        repo.deleteById(id);
    }

}
