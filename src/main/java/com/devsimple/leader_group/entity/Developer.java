package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "developer")
@Data
public class Developer {

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

    public Developer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCmndId() {
        return cmndId;
    }

    public void setCmndId(String cmndId) {
        this.cmndId = cmndId;
    }

    public String getCmndDate() {
        return cmndDate;
    }

    public void setCmndDate(String cmndDate) {
        this.cmndDate = cmndDate;
    }

    public String getCmndPlace() {
        return cmndPlace;
    }

    public void setCmndPlace(String cmndPlace) {
        this.cmndPlace = cmndPlace;
    }

    public String getCmndDocument() {
        return cmndDocument;
    }

    public void setCmndDocument(String cmndDocument) {
        this.cmndDocument = cmndDocument;
    }

    public Boolean getLeader() {
        return isLeader;
    }

    public void setLeader(Boolean leader) {
        isLeader = leader;
    }

    public Boolean getCanLogin() {
        return canLogin;
    }

    public void setCanLogin(Boolean canLogin) {
        this.canLogin = canLogin;
    }

    public String getCvUrl() {
        return cvUrl;
    }

    public void setCvUrl(String cvUrl) {
        this.cvUrl = cvUrl;
    }
}
