package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leadergroup_skill")
@Data
public class Skill {

    @Id
    private Long id;
    private String name;
    private String description;
    private Integer scores;
    private Long userIdCreated;


}
