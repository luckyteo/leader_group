package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leadergroup_team")
@Data
public class Team {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team", fetch = FetchType.LAZY)
    private List<Developer> developers = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team", fetch = FetchType.LAZY)
    private List<Report> reports = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team", fetch = FetchType.LAZY)
    private List<Project> projects = new ArrayList<>();

    @Id
    private Long id;
    private String name;
    private String serviceDescription;
    private String coverImage;
    private Integer status;
    private Long leaderId;

}
