package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "leadergroup_province")
public class Province {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Province parent;
    private String name;
    private String description;

}
