/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.project.training.datahub.application.service.api;

import com.project.training.datahub.domain.DataEntryBean;
import java.util.List;

/**
 * @author Richard Jackson
 */
public interface DataEntryService {
    public List<DataEntryBean> findAll();
    public DataEntryBean findOne(int id);
    public void deleteById(int id);
    public DataEntryBean save(DataEntryBean dataEntryBean);    
}
