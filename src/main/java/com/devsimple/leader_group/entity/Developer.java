package com.devsimple.leader_group.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("2")
public class Developer extends User{

    //Relation

    @OneToOne
    @MapsId
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

    private String phone;
    private String address;
    private String cmndId;
    private String cmndDate;
    private String cmndPlace;
    private String cmndDocument;
    private Boolean isLeader;
    private Boolean canLogin;
    private String cvUrl;
}
