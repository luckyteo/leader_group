package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "leadergroup_report")
public class Report {

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @Id
    private String id;
    private Long teamOwner;
    private Long teamReport;
    private Integer status;
    private String descriptions;
    private Date createAt;
    private Date date;


}
