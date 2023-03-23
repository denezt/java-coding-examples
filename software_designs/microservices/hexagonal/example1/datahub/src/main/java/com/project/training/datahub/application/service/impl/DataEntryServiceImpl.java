/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.training.datahub.application.service.impl;

import com.project.training.datahub.application.service.api.DataEntryService;
import com.project.training.datahub.domain.DataEntryBean;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

/**
 * @author Richard Jackson
 */
@Component
public class DataEntryServiceImpl implements DataEntryService {
    // JPA/Hibernate > Database
    // DataEntryBeanDaoService > Static List
    // ToDo - Put into the domain logic
    private static List<DataEntryBean> dataEntryBeans = new ArrayList<>();
    
    private static int entryCount = 0;
    
    static {
        dataEntryBeans.add(new DataEntryBean(entryCount,"Empty",LocalDate.now()));
        dataEntryBeans.add(new DataEntryBean(++entryCount,"Mark",LocalDate.now().minusYears(30)));
        dataEntryBeans.add(new DataEntryBean(++entryCount,"Fred",LocalDate.now().minusYears(25)));
        dataEntryBeans.add(new DataEntryBean(++entryCount,"Rachel",LocalDate.now().minusYears(20)));
    }  
    
    // public List<DataEntryBean> findAll()
    public List<DataEntryBean> findAll(){
        return dataEntryBeans;
    }
    // public DataEntryBean save(DataEntryBean user)
    public DataEntryBean save(DataEntryBean dataEntryBean){
        dataEntryBean.setId(++entryCount);
        dataEntryBeans.add(dataEntryBean);
        return dataEntryBean;
    }
    
    // public DataEntryBean findOne(int id)
    public DataEntryBean findOne(int id){
        Predicate<? super DataEntryBean> predicate = entry -> entry.getId().equals(id);
        return dataEntryBeans.stream().filter(predicate).findFirst().orElse(null);
    }

    // public void deleteById(int id)
    public void deleteById(int id){
        Predicate<? super DataEntryBean> predicate = entry -> entry.getId().equals(id);
        dataEntryBeans.removeIf(predicate);
    }

}
