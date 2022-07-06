package com.kelp.kelpbackend;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin
;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class LocationController {

    private final LocationRepository repository;

    LocationController(LocationRepository repository) {
        this.repository = repository;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/locations")
    List<Location> all() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/locations")
    Location newLocation(@RequestBody Location newLocation) {
        return repository.save(newLocation);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/locations/{id}")
    Location one(@PathVariable Long id) {

        return repository.findById(id)
        .orElseThrow(null);
    }

 
    @CrossOrigin(origins = "*")
    @PutMapping("/locations/{id}")
    Location replaceLocation(@RequestBody Location newLocation, @PathVariable Long id) {

        return repository.findById(id)
        .map(location -> {
            location.setName(newLocation.getName());
            location.setAbout(newLocation.getAbout());
            return repository.save(location);
        })
        .orElseGet(() -> {
            newLocation.setId(id);
            return repository.save(newLocation);
        });
    }


    @CrossOrigin(origins = "*")
    @DeleteMapping("/locations/{id}")
    void deleteLocation(@PathVariable Long id) {
        repository.deleteById(id);
    }
}