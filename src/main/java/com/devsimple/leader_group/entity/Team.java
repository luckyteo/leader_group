package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "leadergroup_team")
public class Team extends AbstractAuditingEntity{

    @Id
    private String id;
    private String name;
    private String serviceDescription;
    private String coverImage;
    private Integer status;
    private Long leaderId;

}
