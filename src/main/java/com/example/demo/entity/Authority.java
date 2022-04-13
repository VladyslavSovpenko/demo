package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "authorities")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinTable(name = "resident_autorities",
            joinColumns = @JoinColumn(name = "authorities_id"),
            inverseJoinColumns = @JoinColumn(name = "resident_id"))
    private List<Resident> residentList;

    public Authority() {
    }

    public Authority(Long id, String authority) {
        this.id = id;
        this.name = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Resident> getResidentList() {
        return residentList;
    }

    public void setResidentList(List<Resident> residentList) {
        this.residentList = residentList;
    }

    @Override
    public String toString() {
        return name;
    }

}

