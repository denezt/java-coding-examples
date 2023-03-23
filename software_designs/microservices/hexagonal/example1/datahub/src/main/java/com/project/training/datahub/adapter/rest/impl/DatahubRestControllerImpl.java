/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.training.datahub.adapter.rest.impl;

import com.project.training.datahub.domain.DataEntryBean;
import com.project.training.datahub.application.service.api.DataEntryService;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author denezt
 */
@RestController
public class DatahubRestControllerImpl {
    
    private final DataEntryService service; // 

    public DatahubRestControllerImpl(DataEntryService service) {
        this.service = service;
    }
    
    @GetMapping(path = "/")
    public String defaultPage(){
        return "<h1>Welcome To Datahub!!</h1>";
    }

    @GetMapping(path = "/extract-data")
    public List<DataEntryBean> updateData(){
        return service.findAll();
    }
   
    @DeleteMapping("/entry/{id}")
    public void deleteEntry(@PathVariable int id){
        service.deleteById(id);
    }    
    
    @PostMapping(path = "/update-data")
    public ResponseEntity<Object> updateData(@Valid @RequestBody DataEntryBean dataEntryBean){
        DataEntryBean savedEntry = service.save(dataEntryBean);
     
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEntry.getId())
                .toUri();
        // Returns a 201 Status Code
        return ResponseEntity.created(location).build();
    }
}
