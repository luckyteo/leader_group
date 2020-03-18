package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "leadergroup_skill")
@Data
public class Skill {

    @ManyToMany(mappedBy = "skills", fetch = FetchType.LAZY)
    private List<Developer> developers = new ArrayList<>();

    @ManyToMany(mappedBy = "skills", fetch = FetchType.LAZY)
    private List<Project> projects = new ArrayList<>();

    @Id
    private Long id;
    private String name;
    private String description;
    private Integer scores;
    private Long userIdCreated;


}
