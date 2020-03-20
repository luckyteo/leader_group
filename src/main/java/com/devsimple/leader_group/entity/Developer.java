package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "leadergroup_developer")
public class Developer{

    //Relation

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "join_developer_skill",
    joinColumns = @JoinColumn(name = "developer_id", referencedColumnName =
            "user_id"),
    inverseJoinColumns = @JoinColumn(name="skill_id", referencedColumnName =
            "id"))
    private List<Skill> skills = new ArrayList<>();

    //Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String cmndId;
    private String cmndDate;
    private String cmndPlace;
    private String cmndDocument;
    private Boolean isLeader;
    private Boolean canLogin;
    private String cvUrl;
    private String phone;
    private String address;
}
