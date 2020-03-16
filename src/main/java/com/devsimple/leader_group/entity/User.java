package com.devsimple.leader_group.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//Table - User
@Entity
@Table(name = "User")
@Data
public class User {

    //Relation
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "join_user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    private Set<Authority> authorities = new HashSet<>();

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Admin admin;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Developer dev;

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

    public User() {

    }

	public User(Long id, String username, String password, String email, String fullname) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullname = fullname;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public String getResetKey() {
        return resetKey;
    }

    public void setResetKey(String resetKey) {
        this.resetKey = resetKey;
    }

    public String getResetDate() {
        return resetDate;
    }

    public void setResetDate(String resetDate) {
        this.resetDate = resetDate;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", status="
                + status + ", lang=" + lang + ", fullname=" + fullname + ", imageUrl=" + imageUrl + ", activationKey="
                + activationKey + ", resetKey=" + resetKey + ", resetDate=" + resetDate + "]";
    }

}
