package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "leadergroup_admin")
public class Admin{

    /*Relation*/
    @OneToOne
    @MapsId // su dung chung id  FK tren admin voi PK id tren user
    private User user;

    /*Properties*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;
    private String address;
}
