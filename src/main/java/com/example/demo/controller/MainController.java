package com.example.demo.controller;

import com.example.demo.entity.Resident;
import com.example.demo.service.AuthorityService;
import com.example.demo.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ResidentService residentService;

    @Autowired
    private AuthorityService authorityService;

    @GetMapping("/")
    public String getAllResidents(Model model) {
        List<Resident> allResidents = residentService.getAllResidents();
        model.addAttribute("residents", allResidents);
        return "show";
    }

    @GetMapping("/edit/{id}")
    public String editResident(@PathVariable Long id, Model model) {
        Resident resident = residentService.getById(id);
        model.addAttribute("resident", resident);
        return "resident";
    }

    @GetMapping("/delete/{id}")
    public String deleteResident(@PathVariable Long id){
        residentService.deleteResident(id);
        return "redirect:/";
    }

    @PostMapping("/saveResident")
    public String saveResident(@ModelAttribute("resident") Resident resident){
        resident.setEnabled(1L);
        residentService.saveResident(resident);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String addNewResident(Model model){
        Resident resident = new Resident();
        model.addAttribute("resident", resident);
        return "resident";
    }

}
