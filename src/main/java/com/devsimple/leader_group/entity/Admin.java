package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Admin")
public class Admin {

    //Relation
    @OneToOne
    @MapsId // su dung chung id  FK tren admin voi PK id tren user
    //@JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    //Properties

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;

    protected Admin(){}
    public Admin(User user, String phone, String address) {
        this.user = user;
        this.phone = phone;
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
