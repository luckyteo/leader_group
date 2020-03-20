package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "leadergroup_team")
public class Team extends AbstractAuditingEntity{

    @Id
    private Long id;
    private String name;
    private String serviceDescription;
    private String coverImage;
    private Integer status;
    private Long leaderId;

}
