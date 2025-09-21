package com.example.photographersmanagement.controller;

import com.example.photographersmanagement.model.Photographer;
import com.example.photographersmanagement.service.PhotographerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photographers")
@CrossOrigin(origins = "http://localhost:5173/")


public class PhotographerController {
	
	@Autowired
    private PhotographerService service;

	
    @GetMapping("/userData")
    public List<Photographer> getAll() {
        return service.getAllPhotographers();
    }
   // @GetMapping("/getData")
   // public String Sangeetha() {
    	//return " Sangeetha reddy ";
    			
    //}

    @GetMapping("/search")
    public List<Photographer> search(@RequestParam String email) {
        return service.searchByEmail(email);
    }

    @GetMapping("/status")
    public List<Photographer> filter(@RequestParam String status) {
        return service.filterByStatus(status);
    }

    @GetMapping("/{id}")
    public Photographer getById(@PathVariable Long id) {
        return service.getPhotographer(id);
    }

    @PostMapping
    public Photographer create(@RequestBody Photographer photographer) {
        return service.savePhotographer(photographer);
    }
    @PutMapping("/{id}")
    public Photographer update(@PathVariable Long id, @RequestBody Photographer photographer) {
        photographer.setId(id);
        return service.savePhotographer(photographer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePhotographer(id);
    }
	
	

}
