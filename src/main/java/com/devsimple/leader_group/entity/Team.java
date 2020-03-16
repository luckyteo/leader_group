package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Team")
@Data
public class Team {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Developer> developers = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Report> reports = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Project> projects = new ArrayList<>();

    @Id
    private Long id;
    private String name;
    private String serviceDescription;
    private String coverImage;
    private Integer status;
    private Long leaderId;

    public Team(){}

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

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }
}
