package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Project")
public class Project {


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "join_project_skill",
            joinColumns = @JoinColumn(name = "project_id",
                    referencedColumnName =
                    "id"),
            inverseJoinColumns = @JoinColumn(name="skill_id", referencedColumnName =
                    "id"))
    private List<Skill> skills = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    @Id
    private Long id;
    private String name;
    private String description;
    private String imgProject;
    private String imgBg;
    private Integer status;
    private Integer state;
    private Date createAt;
}
