/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.training.datahub.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author denezt
 */
@Data
public class DataEntryBean {
  private Integer id;
    
    @Size(min=2, message = "Name should have at least 2 characters")
    @JsonProperty("username")
    private String name;
    
    @Past(message = "Birthday should be in the past")
    @JsonProperty("birthdate")
    private LocalDate birthdate;

    public DataEntryBean(Integer id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
