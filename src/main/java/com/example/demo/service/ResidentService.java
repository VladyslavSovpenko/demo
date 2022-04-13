package com.example.demo.service;

import com.example.demo.dao.ResidentRepository;
import com.example.demo.entity.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResidentService {

    @Autowired
    private ResidentRepository residentRepository;

    public List<Resident> getAllResidents() {
        return residentRepository.findAll();
    }

    public Resident getById(Long id) {
        Optional<Resident> resident = residentRepository.findById(id);
        if (resident.isPresent()) {
            return resident.get();
        } else {
            return new Resident();
        }
    }

    public void saveResident(Resident resident){
        residentRepository.save(resident);
    }

    public void deleteResident(Long id){
        residentRepository.deleteById(id);
    }

    public Resident getByName(String name){
       return residentRepository.findByName(name);
    }

}
