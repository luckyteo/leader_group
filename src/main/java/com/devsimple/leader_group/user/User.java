package com.devsimple.leader_group.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//Table - User
@Entity
@Table(name = "User")
public class User {

	@Id
	private String id;

	@Column(name = "username")
	@Size(min = 2, message = "username should have atleast 2 characters")
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

	public User(String id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public User(String id, String username, String password, String email, Integer status, String lang, String fullname,
			String imageUrl, String activationKey, String resetKey, String resetDate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
		this.lang = lang;
		this.fullname = fullname;
		this.imageUrl = imageUrl;
		this.activationKey = activationKey;
		this.resetKey = resetKey;
		this.resetDate = resetDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", status="
				+ status + ", lang=" + lang + ", fullname=" + fullname + ", imageUrl=" + imageUrl + ", activationKey="
				+ activationKey + ", resetKey=" + resetKey + ", resetDate=" + resetDate + "]";
	}

}
