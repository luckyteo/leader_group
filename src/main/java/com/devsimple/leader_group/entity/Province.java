package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "leadergroup_province")
public class Province {

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "province")
//    private List<Developer> developers = new ArrayList<>();

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Province parent;
    private String name;
    private String description;

}
