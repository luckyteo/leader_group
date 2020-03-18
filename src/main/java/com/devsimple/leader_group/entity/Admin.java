package com.devsimple.leader_group.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@DiscriminatorValue("1")
public class Admin extends User{

    //Relation
//    @OneToOne
//    @MapsId // su dung chung id  FK tren admin voi PK id tren user
//    //@JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;

    //Properties

//    @Id
//    //@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

}
