package com.devsimple.leader_group.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//Table - User
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "leadergroup_user")
public class User extends AbstractAuditingEntity {

    //Relation
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "join_user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    private Set<Authority> authorities = new HashSet<>();

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Admin admin;
//
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Developer dev;

    //Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private Integer status;

    @Column(name = "lang")
    private String lang;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "activation_key")
    private String activationKey;

    @Column(name = "reset_key")
    private String resetKey;

    @Column(name = "reset_date")
    private String resetDate;

    private String phone;
    private String address;
}
