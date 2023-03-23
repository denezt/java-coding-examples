/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.training.datahub.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;




/**
 *
 * @author Richard Jackson
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Mandant {

    @Getter private final MandantId id;
    
    @Value public static class MandantId {
        private Long value;
    }

   
    
}
