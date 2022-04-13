package com.example.demo.service;

import com.example.demo.dao.AuthorityRepository;
import com.example.demo.entity.Authority;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    public List<Authority> getAll(){
      return authorityRepository.findAll();
    }
}
