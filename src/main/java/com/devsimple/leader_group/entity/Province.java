package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Province")
public class Province {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "province")
    private List<Developer> developers = new ArrayList<>();

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Province parent;
    private String name;
    private String description;

    public Province(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Province getParent() {
        return parent;
    }

    public void setParent(Province parent) {
        this.parent = parent;
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
}
