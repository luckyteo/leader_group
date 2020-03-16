package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Skill")
@Data
public class Skill {

    @ManyToMany(mappedBy = "skills")
    private List<Developer> developers = new ArrayList<>();

    @ManyToMany(mappedBy = "skills")
    private List<Project> projects = new ArrayList<>();

    @Id
    private Long id;
    private String name;
    private String description;
    private Integer scores;
    private Long userIdCreated;

    public Skill() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Long getUserIdCreated() {
        return userIdCreated;
    }

    public void setUserIdCreated(Long userIdCreated) {
        this.userIdCreated = userIdCreated;
    }
}
